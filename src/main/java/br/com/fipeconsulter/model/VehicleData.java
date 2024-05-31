package br.com.fipeconsulter.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VehicleData(@JsonAlias("Modelo") String name,
							@JsonAlias("AnoModelo") int year,
							@JsonAlias("Valor") String cost,
							@JsonAlias("Combustivel") String fuel) {

}
