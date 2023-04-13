package BitManipulation;

import java.util.Scanner;

public class everynumberappears3timesfind1time
{
    public static void main (String[] args)
    {
        int a[] = {2,3,4,5,2,3,4,2,3,4};
        System.out.println(answer(a));
    }

    private static int answer(int[] a)
    {
        int sum = 0;
        for (int i : a)
        {
            sum = sum + i;
        }
        return sum%3; // sum mode 3 as number appears thrice
    }
}
