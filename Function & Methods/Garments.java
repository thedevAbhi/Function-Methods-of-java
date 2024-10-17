import java.util.*;

class GM {
    String GCode;
    String GType;
    int GSize;
    String GFabric;
    float Gprice;

    // Parameterize Constructor
    GM() {
        GCode = "Not Allowed";
        GType = "Not Allowed";
        GFabric = "Not Allowed";
        GSize = 0;
        Gprice = 0.0f;

    }

    public void Assign() {
        if (GFabric.equals("Cotton")) {
            if (GType.equals("Trouser")) {
                Gprice = 1300;
            }
            if (GType.equals("Shirt")) {
                Gprice = 990;
            }
        } else {
            if (GType.equals("Trouser")) {
                Gprice = 1170;
            }
            if (GType.equals("Shirt")) {
                Gprice = 891;
            }
        }
    }

    public void INPUT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Garment Code:-");
        GCode = sc.next();
        System.out.println("Enter the Garment Type:-");
        GType = sc.next();
        System.out.println("Enter the Garment Fabric:-");
        GFabric = sc.next();
        System.out.println("Enter the Garment Size:-");
        GSize = sc.nextInt();
        Assign();

    }

    public void Output() {
        System.out.println("Garment Code:- " + GCode);
        System.out.println("Garment Type:- " + GType);
        System.out.println("Garment Size:- " + GSize);
        System.out.println("Garment Fabric:- " + GFabric);
        System.out.println("Garment Price:-" + Gprice);
    }

}

public class Garments {
    public static void main(String[] args) {
        GM obj1 = new GM();
        obj1.INPUT();
        obj1.Output();
    }
}