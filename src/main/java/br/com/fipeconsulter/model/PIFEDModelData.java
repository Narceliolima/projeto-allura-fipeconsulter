package br.com.fipeconsulter.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PIFEDModelData(@JsonAlias("modelos") List<PIFEData> models) {

}
