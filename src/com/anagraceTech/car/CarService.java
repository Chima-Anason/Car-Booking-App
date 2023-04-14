package com.anagraceTech.car;

public class CarService {

    private final CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public Car getCar(String regNumber) {
        for (Car car : carDao.getAllCars()) {
            if (regNumber.equals(car.getRegNumber())) {
                return car;
            }
        }
        throw new IllegalStateException(String.format("Car with reg-Number %s not found", regNumber));
    }

    public Car[] getAllElectricCars() {
        int count = 0;
        Car[] cars = carDao.getAllCars();

//        if (cars.length == 0) {
//            return new Car[0];
//        }

        for (Car car : cars) {
            if(car.isElectric()){
                count++;
            }
        }

//        if (count == 0) {
//            return new Car[0];
//        }

        Car[] electricCars = new Car[count];

        int index = 0;

        for (int i = 0; i < cars.length; i++) {
            if(cars[i].isElectric()){
                electricCars[index] = cars[i];
                index++;
            }
        }

        return electricCars;
    }

}
