import java.util.*;
public class arrays{
      public static void maxSubArrSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maximum subarrray sum= " +maxSum);
    }
public static void main(String args[]){
    int nums[]={1,2,3,6,7,8,9,9,9};
    maxSubArrSum(nums);
}
}
