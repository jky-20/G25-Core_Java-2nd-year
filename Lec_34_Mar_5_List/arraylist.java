package Lec_34_Mar_5_List;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        // add element
        arrList.add(10);
        arrList.add(20);
        arrList.add(1,15);
        // arrList.add(6,30);  // index out of bound

        // get element
        System.out.println(arrList.get(2));

        // size of list
        arrList.size();

        // replace element
        arrList.set(1, 13);

        // remove element
        arrList.remove(2);

        // sort list
        Collections.sort(arrList);

        // List to string
        String str = arrList.toString();

        // print list
        System.out.println(arrList);

        // arrayList to array
        Object[] arr1 = arrList.toArray();
        Integer[] arr2 = arrList.toArray(new Integer[0]);
        
        // to primitive type array
        int[] arr = arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
