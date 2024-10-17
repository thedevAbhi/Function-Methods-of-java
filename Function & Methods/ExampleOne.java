import java.util.*;

class Addition {
    static int Cal(int a, int b) {
        int ans = a + b;
        // System.out.println("Sum of the input number is : " + ans);
        return ans;
    }
}

public class ExampleOne {
    public static void main(String[] args) {
        Addition obj1 = new Addition();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = obj1.Cal(a, b);
        System.out.println("Show me the result: " + ans);
    }
}