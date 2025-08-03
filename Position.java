public class Position{
    public static void main(String[] args){
        int[] arr={2,3,5,6,10,11,12,15,29,23,30};
        int target=15;
        System.out.println(ans(arr, target));
    }
    static int ans(int[]arr,int target){
        int start=0;
        int end=1;

        while(target > arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;

            if(end>=arr.length){
                end=arr.length-1;
                break;
            }
            start =newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }       

}