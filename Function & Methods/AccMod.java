//usage for public access modifier

import java.util.*;

class OuterClass {
    public void outClass() {
        AccMod obj2 = new AccMod();
        AccMod obj3 = new AccMod();
        System.out.println("In another class: " + obj3.str_2);
        System.out.println("Out of the class: " + obj2.str_1);
    }

}

public class AccMod {
    protected String str_1 = "I am a public Member.";
    public String str_2 = "I am Checking the method.";

    public static void main(String[] args) {
        AccMod obj1 = new AccMod();
        AccMod obj3 = new AccMod();
        OuterClass obj2 = new OuterClass();
        obj1.InnerClass();
        obj2.outClass();
        obj3.check();

    }

    void InnerClass() {
        System.out.println("Within Class: " + str_1);
    }

    void check() {
        System.out.println("Another method in the class: " + str_2);
    }
}
