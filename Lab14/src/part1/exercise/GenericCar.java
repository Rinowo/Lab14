package part1.exercise;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GenericCar<T> {
    List<T> cars = new LinkedList<>();

    public void add(Car cars) {
        this.cars.add((T) cars);
    }

    public void display() {
        for (T car :
                cars) {
            System.out.println(car);
        }
    }

    public void getSize() {
        System.out.println("Size: " + this.cars.size());
    }

    public void checkEmpty() {
        System.out.println(this.cars.isEmpty());
    }

    public void grad() {
        this.cars.sort((o1, o2) -> 0);
    }
}
