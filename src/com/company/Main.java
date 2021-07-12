package com.company;

import java.util.Collection;
import java.util.List;

public class Main {

    private static final CarGenerator carGenerator = new CarGenerator();

    private static void showCollection(Collection collection) {
        collection.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Car> carList = carGenerator.generator();
        PowerComparator powerComparator = new PowerComparator();
        YearComparator yearComparator = new YearComparator();
        carList.sort(powerComparator.thenComparing(yearComparator));
        showCollection(carList);


    }

}
