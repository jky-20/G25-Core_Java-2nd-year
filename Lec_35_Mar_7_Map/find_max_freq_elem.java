package Lec_35_Mar_7_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class find_max_freq_elem {
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
            int prev_freq = hmap.getOrDefault(key, 0);
            hmap.put(key, prev_freq+1);
        }
        
        int ans = arr.get(0);
        int max_freq = 1;
        for(int key : hmap.keySet()){
            int freq = hmap.get(key);
            if(freq > max_freq){
                max_freq = freq;
                ans = key;
            }
            if(freq == max_freq && key > ans){
                ans = key;
            }
        }

        System.out.println(ans + " : " + max_freq);
    }
}
