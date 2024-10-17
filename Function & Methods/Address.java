import java.util.*;

class EmAd {
    String Name;
    String address;
    int join;

    public void Loop() {

    }

    public void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Employee Name:-");
        Name = sc.next();
        System.out.println("Enter The Employee Address:-");
        address = sc.next();
        System.out.println("Year of Joining:-");
        join = sc.nextInt();
    }

    public void dispinfo() {
        System.out.println("Name:-" + Name);
        System.out.println("Address:-" + address);
        System.out.println("Joining Year:-" + join);
    }
}

public class Address {
    public static void main(String[] args) {
        EmAd obj = new EmAd();
        obj.havedata();
        obj.dispinfo();
    }
}
