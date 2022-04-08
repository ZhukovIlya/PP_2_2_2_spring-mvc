package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarsService {

    private List<Car> cars;

    public CarsService(List cars){
        this.cars = cars;
    }
    public List<Car> getCarList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
