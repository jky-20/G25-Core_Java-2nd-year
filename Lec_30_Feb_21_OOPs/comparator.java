package Lec_30_Feb_21_OOPs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Group_25{
    String name;
    int marks;
    Group_25(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString(){
        return ("Name : " + this.name + " || Marks : " + this.marks);
    }
}
class sortByMarks implements Comparator<Group_25>{
    @Override
    public int compare(Group_25 s1, Group_25 s2){
        return Integer.compare(s1.marks, s2.marks);
    }
}
class sortByName implements Comparator<Group_25>{
    @Override
    public int compare(Group_25 s1, Group_25 s2){
        return s1.name.compareTo(s2.name);
    }
}

public class comparator {
    public static void main(String[] args) {
        
        ArrayList<Group_25> arr = new ArrayList<>();
        arr.add(new Group_25("Jai", 63));
        arr.add(new Group_25("Satyam", 55));
        arr.add(new Group_25("Tarun", 32));
        
        Collections.sort(arr, new sortByMarks());
        for(Group_25 s : arr){
            System.out.println(s);
        }
        System.out.println("----------------------------");
        Collections.sort(arr, new sortByName());
        for(Group_25 s : arr){
            System.out.println(s);
        }

        // using lamda function Java 8 and above
        Collections.sort(arr, (s1, s2)->Integer.compare(s1.marks, s2.marks));
        arr.sort((s1, s2)->Integer.compare(s1.marks, s2.marks));

        // using anonymous class (NOT Preferable)
        arr.sort(new Comparator<Group_25>() {
            @Override
            public int compare(Group_25 s1, Group_25 s2){
                return s1.name.compareTo(s2.name);
            }
        });
    }
}
