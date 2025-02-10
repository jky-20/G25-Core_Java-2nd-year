package Lec_24_Feb_7_OOPs;

class example{
    int x;
}

final class parent{
    String name;
}
// class child extends parent{     // can't make subclass of a final class
//     int age;
// }

class example2{
    final String name;
    example2(String name){
        this.name = name;
    }
}

public class final_keyword {
    public static void main(String[] args) {
        
        final int a = 10;
        // a = 20;      // can't be modified

        final int b;
        b = 10;     // initialization
        // b = 20;     // modification (can't be done)

        // using final on objects
        final example m1 = new example();
        m1.x = 10;
        m1.x = 20;
        // m1 = new example();
        System.out.println(m1);

        // creating object of final class
        parent p1 = new parent();
        p1.name = "Jai";

        // non modified objects
        example2 e1 = new example2("JKY");
        // e1.name = "Jai";
    }
}
