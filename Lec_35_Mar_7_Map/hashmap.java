package Lec_35_Mar_7_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            arr.add(a);
        }

        for(int i=0 ; i<arr.size() ; i++){
            int key = arr.get(i);
            // if(hmap.containsKey(key)){
            //     int prev_freq = hmap.get(key);
            //     hmap.put(key, prev_freq+1);
            // }
            // else{
            //     hmap.put(key,1);
            // }
            int prev_freq = hmap.getOrDefault(key, 0);
            hmap.put(key, prev_freq+1);
        }

        System.out.println(hmap);

        // using entryset
        for(var entry : hmap.entrySet()){
            System.out.println("Key : " + entry.getKey() + " || Freq : " + entry.getValue());
        }

        // using keyset
        for(int key : hmap.keySet()){
            System.out.println("Key : "+ key + " || Freq : "+ hmap.get(key));
        }

        // getting list of all values
        System.out.println(hmap.values());
    }
}
