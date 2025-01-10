package function;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Marks ----> ");
        Float a = in.nextFloat();
        mygrade(a);
    }
    static void mygrade(Float a){
        if (a>90 & a<=100) {
            System.out.println("Congrats !!! Your Grade is AA");
        }
        if (a>80 & a<=90) {
            System.out.println("Your Grade is AB \nYou can still do better");
        }
        if (a>70 & a<=80) {
            System.out.println("Your Grade is BB \nNot Bad ! But still can do better!");
        }
        if (a>60 & a<=70) {
            System.out.println("Your Grade is BC \nMinimise Your Mistakes & Learn From Them");
        }
        if (a>50 & a<=60) {
            System.out.println("Your Grade is CD \nLearn The Concepts Again Properly \nAnd you will become better !");
        }
        if (a>40 & a<=50) {
            System.out.println("Your Grade is DD \nNeeds Hardwork !!!! ");
        }
        if (a>0 & a<=40) {
            System.out.println("Sorry You Failed ! \nWork Hard & Become Better");
        }

    }
}
