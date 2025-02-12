package Lec_26_Feb_12_OOPs;

abstract class A{
    int a;
    // A(){

    // }
    A(int a){
        this.a = a;
    }
}
class B extends A{
    int b;
    // B(){
    //     super(10);
    // }
    // B(int a){
    //     super(a);
    // }
    B(int a, int b){
        super(a);
        this.b = b;
    }
}

public class question {
    public static void main(String[] args) {
        
    }
}
