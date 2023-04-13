package BitManipulation;

import java.util.Scanner;

public class resetithBitMakeit0
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 20;
        System.out.println(answer(n,x));
    }

    private static int answer(int n, int x)
    {
        return x & ~(1 << (n-1));
    }
}
