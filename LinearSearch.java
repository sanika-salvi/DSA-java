public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {18,12,7,3,14,23};
        int target = 3;
        System.out.println(linearSearch(arr,target,1,4));
    
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0;index<=end;index++){
            int element=arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}