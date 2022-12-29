package es.jugmadrid.springboot3.model;

import es.jugmadrid.springboot3.controller.criteria.FuelType;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class CarDto {

    private int id;
    private String make;
    private FuelType fuelType;
    private int numberOfDoors;
    private BigDecimal price;

}