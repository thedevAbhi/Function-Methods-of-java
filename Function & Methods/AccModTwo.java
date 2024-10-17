//usage for public access modifier

import java.util.*;

class OutOfClass {
    public void takeData() {
        AccMod obj3 = new AccMod();
        AccModThree obj4 = new AccModThree();
        System.out.println("Fetching data from out of the file:-" + obj3.str_1);
        System.out.println("from another class but protected: " + obj4.str_1);
    }
}

public class AccModTwo {
    public static void main(String[] args) {
        OutOfClass obj3 = new OutOfClass();
        OutOfClass obj4 = new OutOfClass();
        obj4.takeData();
        obj3.takeData();
    }
}
