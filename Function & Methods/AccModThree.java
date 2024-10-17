//using for protected accsess modifier

import java.util.*;

class Protection {

}

public class AccModThree {
    protected String str_1 = "I am protected Member";

    public static void main(String[] args) {
        AccModThree obj1 = new AccModThree();
        System.out.println("in the same class : " + obj1.str_1);
        obj1.partOne();
    }

    void partOne() {
        AccModThree obj1 = new AccModThree();
        System.out.println("Out of the main class: " + obj1.str_1);
    }
}
