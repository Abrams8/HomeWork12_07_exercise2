package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarGenerator {

    public List generator () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во объектов для генерации: ");
        int count = in.nextInt();
        List<Car> collection = new ArrayList<>(count);
        for (int i = 0; i<count; i++){
            int z = (int) ((Math.random() * 150) + 9);
            Car car = new Car();
            if (z < 5) {
                car.setName("BMW");
                car.setEngineType(EngineType.DIESEL);
            }
            if (z <10) {
                car.setName("BMW");
                car.setEngineType(EngineType.ELECTRO);
            }
            if (z<20) {
                car.setName("Audi");
                car.setEngineType(EngineType.FUEL);
            }
            if (z <30) {
                car.setName("Audi");
                car.setEngineType(EngineType.GAS);
            }
            if (z<40) {
                car.setName("Honda");
                car.setEngineType(EngineType.ELECTRO);
            }
            if (z <50) {
                car.setName("Peugeot");
                car.setEngineType(EngineType.FUEL);
            }
            if (z <60) {
                car.setName("Acura");
                car.setEngineType(EngineType.FUEL);
            }
            if (z <70) {
                car.setName("Mercedes");
                car.setEngineType(EngineType.DIESEL);
            }
            if (z <85) {
                car.setName("Cadilac");
                car.setEngineType(EngineType.GAS);
            } else {
                car.setName("Toyota");
                car.setEngineType(EngineType.DIESEL);
            }
            car.setPower((int) ((Math.random() * 100) + 100));
            car.setYear((int) ((Math.random() * 100) + 1922));
            collection.add(car);
        }
        System.out.println(collection);
        return collection;
    }
}
