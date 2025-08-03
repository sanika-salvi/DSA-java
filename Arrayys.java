import java.util.Arrays;

public class Arrayys{
    public static void main (String[] args){
        int arr[] = {3,56,78,9,26};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int nums[]){
        nums[1] = 6;
    }

}