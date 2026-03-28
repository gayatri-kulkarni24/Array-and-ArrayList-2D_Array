import java.util.*;
 public class twodArrays{
          public static void diagonalSum(){//O(n^2)
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //primary diagonal
                if(i==j){
                    sum+=matrix[i][j];
                }else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("diagonal sum=" +sum);
    }
public static void main(String args[]){
      diagonalSum();
}
 }
