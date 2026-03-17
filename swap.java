import java.util.*;
public class arraylist{
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static  void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(90);
        list.add(4);
        list.add(456);
        swap(list,1,3);
        System.out.println(list);
    }
}
