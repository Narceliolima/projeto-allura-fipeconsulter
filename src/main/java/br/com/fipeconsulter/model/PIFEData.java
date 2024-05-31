package br.com.fipeconsulter.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PIFEData(@JsonAlias("nome") String name,
						@JsonAlias("codigo") int code) {

}
