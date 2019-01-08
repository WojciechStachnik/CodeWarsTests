package MaximumSubarraySum;

public class main {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        if (arr.length == 0){
            System.out.println(0);
        }else{
            int maxCurrent = arr[0];
            int maxSum = arr[0];
            for (int i = 1; i < arr.length; i++){
                maxCurrent = Math.max(arr[i],maxCurrent + arr[i]);
                maxSum = Math.max(maxSum,maxCurrent);
                System.out.println(maxSum);
            }
        }
    }
}
