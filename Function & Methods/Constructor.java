import java.util.*;

//Example of Paramiterize constructor

class Practice {
    int a;
    int b;

    Practice(int x, int y) {
        System.out.println("Calling Constructor");
        a = x;
        b = y;
    }

    int Add() {
        int sum = a + b;
        return sum;
    }

    int Sub() {
        int subb = a - b;
        return subb;
    }

    int Mul() {
        int mul = a * b;
        return mul;
    }

    int Div() {
        int div = a / b;
        return div;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Practice obj1 = new Practice(4, 4);
        Practice obj2 = new Practice(5, 5);
        System.out.println(obj1.Add());
        System.out.println(obj1.Mul());
        System.out.println(obj1.Div());
        System.out.println(obj2.Add());
        System.out.println(obj2.Mul());
        System.out.println(obj2.Div());
    }
}
