package Lec_27_Feb_13_OOPs;

interface X{
    void print();
    default void function(){
        System.out.println("default function");
    }
}
interface A extends X{
    void print();
    default void function(){
        System.out.println("default function");
    }
}
interface B extends X{
    void print();
    // default void function(){
    //     System.out.println("default function");
    // }
}
interface C extends A, B{
    void print();
    // default void function(){
    //     System.out.println("default function");
    // }
}
class Z implements A,B{
    public void print(){
        System.out.println("Multiple Inheritance");
    }
    public void function(){
        System.out.println("default function");
        A.super.function();
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        
    }
}
