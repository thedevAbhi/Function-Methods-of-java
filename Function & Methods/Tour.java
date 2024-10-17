import java.util.*;

class TG {
    String TCode;
    int NoofAdults;
    int NoofKids;
    int Kilometers;
    float Totalfare;

    TG() {
        TCode = "Null";
        NoofAdults = 0;
        NoofKids = 0;
        Kilometers = 0;
        Totalfare = 0.0f;
    }

    public void AssignFare() {
        if (Kilometers >= 1000) {
            Totalfare = NoofAdults * 500 + NoofKids * 250;
        }
        if (Kilometers >= 500 && Kilometers < 1000) {
            Totalfare = NoofAdults * 300 + NoofKids * 150;
        }
        if (Kilometers < 500) {
            Totalfare = NoofAdults * 250 + NoofKids * 125;
        }
    }

    public void EnterTour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the TOUR CODE:- ");
        TCode = sc.next();
        System.out.println("Enter the No Of Adults:- ");
        NoofAdults = sc.nextInt();
        System.out.println("Enter the No Of Kids:- ");
        NoofKids = sc.nextInt();
        System.out.println("Enter The kilometers:- ");
        Kilometers = sc.nextInt();
        AssignFare();
    }

    public void ShowTour() {
        System.out.println("Tour Details:");
        System.out.println("Tour Code;- " + TCode);
        System.out.println("No Of Adults:- " + NoofAdults);
        System.out.println("No Of Kids:- " + NoofKids);
        System.out.println("Total distance:- " + Kilometers);
        System.out.println("Total fare:- " + Totalfare);
    }
}

public class Tour {
    public static void main(String[] args) {
        TG obj1 = new TG();
        obj1.EnterTour();
        obj1.ShowTour();
    }
}
