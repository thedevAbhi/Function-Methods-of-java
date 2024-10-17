import java.util.*;

class Empl {
    int empno;
    String ename;
    float basic, hra, da, netPay;

    public float CalCulate() {
        netPay = basic + hra + da;
        return netPay;
    }

    public void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Number:-");
        empno = sc.nextInt();
        System.out.println("Enter Name:-");
        ename = sc.next();
        System.out.println("Enter Basic, Hra , Da:-");
        basic = sc.nextFloat();
        hra = sc.nextFloat();
        da = sc.nextFloat();
        netPay = CalCulate();
    }

    public void dispdata() {
        System.out.println("Employee Details");
        System.out.println("Employee Number:- " + empno);
        System.out.println("Name:- " + ename);
        System.out.println("Basic:- " + basic);
        System.out.println("Hra:- " + hra);
        System.out.println("DA:- " + da);
        System.out.println("Net Pay:-" + netPay);
    }
}

public class Employee {
    public static void main(String[] args) {
        Empl obj1 = new Empl();
        obj1.havedata();
        obj1.dispdata();
    }
}
