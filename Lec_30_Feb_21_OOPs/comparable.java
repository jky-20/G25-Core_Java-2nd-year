package Lec_30_Feb_21_OOPs;
import java.util.ArrayList;
import java.util.Collections;

class G_25 implements Comparable<G_25>{
    String name;
    int marks;
    G_25(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(G_25 s2){
        return Integer.compare(this.marks, s2.marks);
    }
    public String toString(){
        return ("Name : " + this.name + " || Marks : " + this.marks);
    }
}
public class comparable {
    public static void main(String[] args) {
        
        ArrayList<G_25> arr = new ArrayList<>();
        arr.add(new G_25("Jai", 63));
        arr.add(new G_25("Satyam", 55));
        arr.add(new G_25("Tarun", 32));
        Collections.sort(arr);

        for(G_25 s : arr){
            System.out.println(s);
        }
    }
}
