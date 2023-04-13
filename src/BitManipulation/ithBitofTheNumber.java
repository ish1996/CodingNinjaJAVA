package BitManipulation;

import java.util.Scanner;

public class ithBitofTheNumber
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 20; //10100
        System.out.println(answer(n, x)); //00100 4
    }

    private static int answer(int n, int x)
    {
        return x & (1 << (n-1));// 10100 & (1 << 2) = 10100 & (100)
    }
}
