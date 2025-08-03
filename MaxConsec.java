public class MaxConsec {
    public static void main(String args[]){
        int[] arr={0,1,0,1,1,1,1};
        System.out.println(maxconsec(arr));
    }
    static int maxconsec(int[] arr){
        if(arr.length == 0) return 0;

        int max=1,count=1;

        for (int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1])count++;
            else count=1;
            max =Math.max(max,count);
        }
        return max;
    }
}
