package part1.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenericCar genericCar = new GenericCar();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            int choose = sc.nextInt();

            switch (choose) {
                case 1 -> {
                    System.out.print("Enter name: "); String name = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter price: "); Double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter production: "); String production = sc.nextLine();
                    Car car = new Car(name, price, production);
                    genericCar.add(car);

                }
                case 2 -> genericCar.display();
                case 3 -> genericCar.getSize();
                case 4 -> genericCar.checkEmpty();
                case 5 -> genericCar.grad();
                case 6 -> System.exit(0);
            }
        }
    }

    public static void menu(){
        System.out.println("Menu");
        System.out.println("-----------------------");
        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. GetSize");
        System.out.println("4. CheckEmpty");
        System.out.println("5. Grad");
        System.out.println("6. Exit");
        System.out.print("Choose: ");
    }
}
