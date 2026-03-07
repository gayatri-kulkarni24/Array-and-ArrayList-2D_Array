import java.util.*;
public class arrays{
  public static void reverseArray(int arr[]){
        int first=0,last=arr.length-1;
        while(first < last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
public static void main(String args[]){
    int arr[]={1,2,3,6,7,8,9,9,9};
    reverseArray(arr);
     for(int i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
     }
}
}
