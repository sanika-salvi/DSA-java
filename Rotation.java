public class Rotation {
   public  static void main(String[]args){
    int[] arr = {15,18,19,2,3,6,12};
    System.out.println(count(arr));
   } 
   static int count(int[]arr){
    int start=0;
    int end = arr.length-1;

    while(start<end){
        int mid=start+(end-start)/2;

        if(arr[mid]>arr[end]){
            start=mid+1;
        }else{
            end=mid;
        }
    }
    return start;
    
   }
}
