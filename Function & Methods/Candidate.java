//Practice Qustion Three 

import java.util.*;

class Select {
    int RNo;
    String Name;
    String Remarks;
    float Score;

    public void AssignRem() {
        if (Score >= 50) {
            Remarks = "Selected";
        }
        if (Score < 50) {
            Remarks = "Not Selected";
        }
    }

    public void ENTER() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the RNo:-");
        RNo = sc.nextInt();
        System.out.println("Enter name:-");
        Name = sc.next();
        System.out.println("Enter Score:-");
        Score = sc.nextFloat();
        AssignRem();
    }

    public void DISPLAY() {
        System.out.println("RNo:- " + RNo);
        System.out.println("Name:-" + Name);
        System.out.println("Score:- " + Score);
        System.out.println("Remarks:- " + Remarks);
    }
}

public class Candidate {
    public static void main(String[] args) {
        Select obj1 = new Select();
        obj1.ENTER();
        obj1.DISPLAY();
    }
}
