package BitManipulation;

import java.util.Scanner;

public class panda
{
    public static void main(String[] args) {
        System.out.println("I Love Pwanda");
        Scanner A=new Scanner(System.in);
        String B=A.nextLine();
        System.out.println(B);
        int Number=A.nextInt();
        System.out.println(Number);
        if (Number%2 == 1)
        {
            System.out.println("ODD");
        }
        else
        {
            System.out.println("Even");
        }

    }
}
