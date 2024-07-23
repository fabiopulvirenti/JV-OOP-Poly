package org.example.vehicles;

import org.example.vehicles.Car;
import org.example.vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car = new Car("Mercedes","Eclass");
        Motorcycle motorcycle = new Motorcycle("Suzuki","CBB600RR",true);

        car.accelerate();
        motorcycle.accelerate();


    }







}
