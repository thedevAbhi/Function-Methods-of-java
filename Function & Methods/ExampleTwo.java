import java.util.*;

class Rectangle {
    int length;
    int width;

    static void getData(int x, int y) {
        int length = x;
        int width = y;
    }

    int getArea(int length, int width) {
        int area = length * width;
        System.out.println(area);
        return area;
    }
}

public class ExampleTwo {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        obj1.getData(x, y);
        obj2.getArea(x, y);
    }
}
