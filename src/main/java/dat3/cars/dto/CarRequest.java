package dat3.cars.dto;

import dat3.cars.entity.Car;

public class CarRequest {

    String brand;
    String model;
    double pricePrDay;
    double bestDiscount;

    public static Car getCarEntity(CarRequest c){
        return new Car(c.brand, c.model, c.pricePrDay, c.bestDiscount);
    }

    public CarRequest(Car c) {
        this.brand = c.getBrand();
        this.model = c.getModel();
        this.pricePrDay = c.getPricePrDay();
        this.bestDiscount = c.getBestDiscount();
    }
}
