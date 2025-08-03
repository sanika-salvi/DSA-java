public class MinimumNo {
    public static void main (String[] args)  {
        int[] arr={8,12,-7,3,14,28};
        System.out.println(mini(arr));

    }  
    static int mini(int arr[]){
        int ans= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;

    }
}
