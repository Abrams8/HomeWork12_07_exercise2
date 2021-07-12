package com.company;

import java.util.Objects;

public class Car {

    private String name;
    private Integer year;
    private Integer power;
    private EngineType engineType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(year, car.year) && Objects.equals(power, car.power) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, power, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", power=" + power +
                ", engineType=" + engineType +
                '}';
    }

    public Car(String name, Integer year, Integer power, EngineType engineType) {
        this.name = name;
        this.year = year;
        this.power = power;
        this.engineType = engineType;
    }
    public Car(){

    }
}
