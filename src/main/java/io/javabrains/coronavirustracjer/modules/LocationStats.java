package io.javabrains.coronavirustracjer.modules;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;


}
