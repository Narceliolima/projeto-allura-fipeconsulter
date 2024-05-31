package br.com.fipeconsulter.services;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class JsonDataConverter {
	
	private ObjectMapper mapper = new ObjectMapper();

	public <T> T getJsonData(String data, Class<T> classOfT){
		
		try {
			return mapper.readValue(data, classOfT);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public <T> List<T> getJsonDataList(String data, Class<T> classOfT){
		
		CollectionType list = mapper.getTypeFactory().constructCollectionType(List.class, classOfT);
		
		try {
			return mapper.readValue(data, list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
