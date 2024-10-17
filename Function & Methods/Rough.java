import java.util.*;

class App {
    void outerClass() {
        Rough obj = new Rough();
        System.out.println("Out of the class: " + obj.str_2);
    }
}

public class Rough {
    public String str_2 = "I am Public";

    public static void main(String[] args) {
        Rough obj1 = new Rough();
        App obj = new App();
        obj1.innerClass();
        obj.outerClass();
    }

    void innerClass() {
        System.out.println("Within class: " + str_2);
    }
}
