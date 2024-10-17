//practice question Four

import java.util.*;

class Hotel {
    int RoomNO;
    String CustomerName;
    double Charges;
    double Days;

    public double Compute() {
        double amount;
        amount = Days * Charges;
        if (amount >= 11000) {
            amount = 1.02 * amount;
        }
        return amount;
    }

    public void GetInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Room no:-");
        RoomNO = sc.nextInt();
        System.out.println("Customer Name:- ");
        CustomerName = sc.next();
        System.out.println("Enter Charges:-");
        Charges = sc.nextDouble();
        System.out.println("Enter Days:- ");
        Days = sc.nextDouble();
    }

    public void DispInfo() {
        System.out.println("Total cost with details");
        System.out.println("Room No:-" + RoomNO);
        System.out.println("Customer Name:-" + CustomerName);
        System.out.println("Number Of Days:- " + Days);
        System.out.println("Toatal Charges:- " + Charges);
        System.out.println("Total COst:-" + Compute());
    }
}

public class Resort {
    public static void main(String[] args) {
        Hotel obj1 = new Hotel();
        obj1.GetInfo();
        obj1.DispInfo();
    }
}
