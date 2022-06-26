package part1.exercise;

public class Car {
    String name;
    double price;
    String production;

    public Car(String name, double price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProduction() {
        return production;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", production='" + production + '\'' +
                '}';
    }
}
