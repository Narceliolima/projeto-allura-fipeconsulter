package br.com.fipeconsulter.main;

public class GUIText {
	
	public static final String[] MENU_ITEM1 = {"Carros", "Caminhoes", "Motos"};
	public static final String MENU_1 = """
			========================//========================
			Bem vindo ao FIPE Consulter
			
			Digite o numero do veiculo que deseja consultar
			-------------------------------------------------
			|1 - %s					|
			|2 - %s					|
			|3 - %s					|
			-------------------------------------------------
			========================//========================""".formatted(MENU_ITEM1[0],MENU_ITEM1[1],MENU_ITEM1[2]);
	
	public static final String MENU_2_1 = """
			========================//========================			
			Segue a baixo a fabricante dos possiveis %s para consulta.
			-------------------------------------------------""";
	public static final String MENU_2_2 = """
			========================//========================			
			Digite a fabricante
			========================//========================""";
	
	public static final String MENU_3_1 = """
			========================//========================			
			Segue a baixo o modelo dos possiveis %s para consulta.
			-------------------------------------------------""";
	
	public static final String MENU_3_2 = """
			========================//========================			
			Digite o numero do modelo
			========================//========================""";
	
	public static final String MENU_END = """
			-------------------------------------------------
			========================//========================""";
	
	public static void printMenuItemOnCenter(String menuItem) {
		if(menuItem.length()<7) {
			System.out.printf("| 		%s 				|\n",menuItem);
		}
		else if(menuItem.length()<15){
			System.out.printf("| 		%s 			|\n",menuItem);
		}
		else if (menuItem.length()<21){
			System.out.printf("| 		%s   		|\n",menuItem);
		}
	}
	
	public static void printMenuItemWithNumberOnLeft(String menuItem, int numero) {
		System.out.println("|"+menuItem+" |>>> Numero:"+numero);
	}
}
