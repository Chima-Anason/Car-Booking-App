package com.anagraceTech.car;

import java.math.BigDecimal;

public class CarDao {

    private static final Car[] cars;

    static {
        cars = new Car[]{
                new Car("1234", new BigDecimal("89.00"), Brand.TESLA, true),
                new Car("5678", new BigDecimal("50.00"), Brand.AUDI, false),
                new Car("5678", new BigDecimal("77.00"), Brand.MERCEDES, false),
        };
    }

    public Car[] getAllCars(){
        return cars;
    }
}
