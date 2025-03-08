package Lec_34_Mar_5_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arrList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            arrList.add(a);
        }

        int maxE = arrList.get(0);
        for(int elem : arrList){
            maxE = Math.max(maxE, elem);
        }
        System.out.println(maxE);

        // using Collections.max();
        maxE = Collections.max(arrList);
        System.out.println(maxE);
    }
}
