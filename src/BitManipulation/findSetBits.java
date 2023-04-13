package BitManipulation;

public class findSetBits {
    public static void main(String[] args) {
        int number =55;
        int last;
        int sum =0 ;
        while(number>0)
        {
            last = number&1;
            number = number>>1;
            if (last==1)
            {
                sum = sum +last;
            }
        }
        System.out.println(sum);
    }
}
