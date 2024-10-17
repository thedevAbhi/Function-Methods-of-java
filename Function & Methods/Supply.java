//Practice Question Two

import java.util.*;

class Food {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    public void GetType() {
        if (Sticker.equals("Green")) {
            FoodType = "Vegeterian";
        }
        if (Sticker.equals("Yellow")) {
            FoodType = "Contains Egg";
        }
        if (Sticker.equals("Red")) {
            FoodType = "Non Vegeterian";
        }

    }

    public void FoodIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Code:- ");
        Code = sc.nextInt();
        System.out.println("Enter The FoodName:- ");
        FoodName = sc.next();
        System.out.println("Enter the Sticker Color:-");
        Sticker = sc.next();
        GetType();
    }

    public void FoodOut() {
        System.out.println("You Ordered");
        System.out.println("Food Code:- " + Code);
        System.out.println("Food Name:- " + FoodName);
        System.out.println("Sticker Color:-" + Sticker);
        System.out.println("Food Type:- " + FoodType);
    }
}

public class Supply {
    public static void main(String[] args) {
        Food obj1 = new Food();
        // obj1.GetType();
        obj1.FoodIn();
        obj1.FoodOut();
    }
}
