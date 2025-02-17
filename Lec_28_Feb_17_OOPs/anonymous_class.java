package Lec_28_Feb_17_OOPs;

interface A{
    void display();
}
abstract class B{
    abstract void print();
}

public class anonymous_class {
    public static void main(String[] args) {
        
        A a = new A(){
            public void display(){
                System.out.println("Anonymous class from Interface");
            }
        };
        a.display();

        B b = new B(){
            void print(){
                System.out.println("Anonymous class from Abstract Class");
            }
        };
    }
}
