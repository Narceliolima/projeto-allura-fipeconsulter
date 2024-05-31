package br.com.fipeconsulter.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.fipeconsulter.model.PIFEDModelData;
import br.com.fipeconsulter.model.PIFEData;
import br.com.fipeconsulter.model.Vehicle;
import br.com.fipeconsulter.model.VehicleData;
import br.com.fipeconsulter.model.YearData;
import br.com.fipeconsulter.services.APIConsumer;
import br.com.fipeconsulter.services.JsonDataConverter;

public class MainMenu {
	
	private final String BASE_NAME_FOR_SEARCH = "FIPE Consult";
	private final String URL = "https://parallelum.com.br/fipe/api/v1/"+BASE_NAME_FOR_SEARCH;
	private APIConsumer consumer = new APIConsumer(URL, BASE_NAME_FOR_SEARCH);
	private JsonDataConverter converter = new JsonDataConverter();
	private String dataToSearch;

	public void showMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(GUIText.MENU_1);
		int index = sc.nextInt()-1;
		sc.nextLine();
		dataToSearch = GUIText.MENU_ITEM1[index].toLowerCase()+"/marcas";
		String data = consumer.getData(dataToSearch);
		
		List<PIFEData> manufaturerList = Arrays.stream(converter.getJsonData(data, PIFEData[].class)).collect(Collectors.toList());
		System.out.println(GUIText.MENU_2_1.formatted(GUIText.MENU_ITEM1[index]));
		manufaturerList.stream().forEach(manufaturer -> GUIText.printMenuItemOnCenter(manufaturer.name()));
		System.out.println(GUIText.MENU_END);
		System.out.println(GUIText.MENU_2_2);
		Optional<PIFEData> manufaturerOption = Optional.empty();
		while(manufaturerOption.isEmpty()) {
			String manufaturerSearch = sc.nextLine();
			manufaturerOption = manufaturerList.stream().filter(manufaturer -> manufaturer.name().equalsIgnoreCase(manufaturerSearch)).findFirst();
			if(manufaturerOption.isEmpty()) {
				System.out.println("Digite uma marca valida (consulte a lista acima)");
			}
		}
		
		dataToSearch += "/"+manufaturerOption.get().code()+"/modelos";
		data = consumer.getData(dataToSearch);
		List<PIFEData> vehicleList = converter.getJsonData(data, PIFEDModelData.class).models();
		System.out.println(GUIText.MENU_3_1.formatted(GUIText.MENU_ITEM1[index]));
		vehicleList.stream().forEach(vehicle -> GUIText.printMenuItemWithNumberOnLeft(vehicle.name(),vehicle.code()));
		System.out.println(GUIText.MENU_END);
		System.out.println(GUIText.MENU_3_2);
		manufaturerOption = Optional.empty();
		while(manufaturerOption.isEmpty()) {
			int vehicleSearch = sc.nextInt();
			sc.nextLine();
			manufaturerOption = vehicleList.stream().filter(vehicle -> vehicle.code() == vehicleSearch).findFirst();
			if(manufaturerOption.isEmpty()) {
				System.out.println("Digite um numero valido (consulte a lista acima)");
			}
		}

		dataToSearch += "/"+manufaturerOption.get().code()+"/anos";
		data = consumer.getData(dataToSearch);
		List<YearData> vehicleYearList = Arrays.stream(converter.getJsonData(data, YearData[].class)).collect(Collectors.toList());
		List<Vehicle> yearVehicleList = new ArrayList<>();
		vehicleYearList.stream().forEach(vehicleYear -> {
			Vehicle vehicle = new Vehicle(converter.getJsonData(consumer.getData(dataToSearch+"/"+vehicleYear.code()), VehicleData.class));
			yearVehicleList.add(vehicle); 
		});
		
		yearVehicleList.stream().forEach(System.out::println);
		
		System.out.println("Fim da Aplicacao");
		
		sc.close();
	}
}
