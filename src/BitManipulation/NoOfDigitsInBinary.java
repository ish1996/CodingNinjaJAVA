package BitManipulation;

public class NoOfDigitsInBinary {
    public static void main(String[] args) {
        int n = 6;
        int b = 2;
        System.out.println((int)(Math.log(n)/Math.log(b)) +1);
    }//complexity log n
}
