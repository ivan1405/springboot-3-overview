package es.jugmadrid.springboot3.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateCarRequest {

    private String brand;
    private String model;
    private Integer numberOfDoors;
    private FuelType fuelType;
    private BigDecimal price;
}