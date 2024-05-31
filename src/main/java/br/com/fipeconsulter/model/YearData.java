package br.com.fipeconsulter.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record YearData(@JsonAlias("nome") String name,
						@JsonAlias("codigo") String code) {

}
