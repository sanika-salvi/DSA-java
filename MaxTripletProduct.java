
import java.util.Arrays;

public class MaxTripletProduct {
    public static void main (String[] args) {
        int[] arr= {10,3,5,6,20,-10,-20};
        int result=maxproduct(arr); 
        System.out.println("Maximum Product of The Triplet:" + result);
    }
    static int maxproduct(int[]arr){
        int n=arr.length;

        Arrays.sort(arr);
        int prod1=arr[n-1]*arr[n-2]*arr[n-3];
        int prod2=arr[0]*arr[1]*arr[n-1];

        return Math.max(prod1,prod2);
    }
}
