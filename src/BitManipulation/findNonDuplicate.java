package BitManipulation;

public class findNonDuplicate
{
    public static void main(String[] args)
    {
        int arr[] = {2,5,3,5,6,3,2};
        System.out.println(answer(arr));
    }

    private static int answer(int[] arr)
    {
        int unique = 0;
        for (int i : arr)
        {
            unique = unique^ i;
        }
        return unique;
    }
}
