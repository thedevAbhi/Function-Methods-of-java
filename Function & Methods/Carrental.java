//Practice Question One

import java.util.*;

class Car {
    int carID;
    String CarType;
    int rent;

    public void getCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Car ID:- ");
        carID = sc.nextInt();
        System.out.println("Enter the CarType:- ");
        CarType = sc.next();
    }

    public int getRent() {
        if (CarType.equals("Small")) {
            rent = 1000;
        }
        if (CarType.equals("Van")) {
            rent = 800;
        }
        if (CarType.equals("SUV")) {
            rent = 2500;
        }
        return rent;
    }

    public void ShowCar() {
        System.out.println("Car ID: " + carID);
        System.out.println("Car type: " + CarType);
        System.out.println("Car Rent: " + getRent());
    }

}

public class Carrental {
    public static void main(String[] args) {
        Car obj1 = new Car();
        // Car obj2 = new Car();
        obj1.getCar();
        obj1.getRent();
        obj1.ShowCar();
    }
}
