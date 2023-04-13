package Recursion;

public class fibonacciSeries {
    public static void main(String[] args)
    {
        System.out.println(fibo(6));
    }

    private static int fibo(int i) {
        if(i==0)
        {
            return 0;
        }
        int oneless = fibo(i-1);
        return i * oneless;
    }

}
