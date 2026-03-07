import java.util.*;
public class arrays{
     public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
public static void main(String args[]){
  int arr[]={1,2,3,6,7,8,9,9,9};
  System.out.println(getLargest(arr));
}
   
}
