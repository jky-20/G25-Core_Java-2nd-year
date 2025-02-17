package Lec_28_Feb_17_OOPs;

class Outer{
    int a;

    private class private_class{
        int d;
    }
    class Inner{
        int b;
        void func(){
            display();
            print();
        }
    }
    static class static_inner{
        int c;
        void func(){
            display();
            // print();    // can't access non static members directly
        }
    }
    static void display(){
        System.out.println("staic function");
    }
    void print(){
        System.out.println("staic function");
    }
}

public class nested_class {
    class example{
        int a;
    }
    static class example2{
        int c;
    }
    public static void main(String[] args) {
        
        Outer outer_obj = new Outer();
        Outer.Inner inner_obj = outer_obj.new Inner();
        inner_obj.b = 10;

        Outer.static_inner static_inner_obj = new Outer.static_inner();
        static_inner_obj.c = 20;

        // example ex = new example();  // can't access non static members directly
        example2 ex2 = new example2();

        class inner_class{
            int x;
            int y;
        }
        inner_class obj = new inner_class();
        obj.x = 10;
    }
}
