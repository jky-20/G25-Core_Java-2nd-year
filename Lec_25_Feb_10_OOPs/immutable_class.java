package Lec_25_Feb_10_OOPs;

class Mutable{
    int x;
}

final class Immutable{
    final private int a;
    final private int b;
    final private Mutable m;

    Immutable(int a, int b, Mutable m){
        this.a = a;
        this.b = b;
        // this.m = m;     // shallow copy

        // deep copy
        this.m = new Mutable();
        this.m.x = m.x;
    }
    int get_a(){
        return this.a;
    }
    int get_b(){
        return this.b;
    }
    Mutable get_m(){
        // return this.m;

        // return defensive copy
        Mutable temp = new Mutable();
        temp.x = this.m.x;
        return temp;
    }
    void print(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("m : " + m.x);
        System.out.println("-------------");
    }
}

public class immutable_class {
    public static void main(String[] args) {
        
        Mutable m = new Mutable();
        m.x = 10;
        Immutable im = new Immutable(10, 20, m);
        // im.a = 10;
        // im.b = 20;   // final and private data members
        // im.a = 30;
        im.print();
        m.x = 30;
        im.print();

        Mutable m1 = im.get_m();
        m1.x = 30;
        im.print();
    }
}
