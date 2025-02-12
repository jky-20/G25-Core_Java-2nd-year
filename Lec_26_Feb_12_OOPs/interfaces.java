package Lec_26_Feb_12_OOPs;

interface Animal{
    int age = 10;
    void makes_sound();
    // Animal(){
    //     System.out.println("Interfaces can't have constructors");
    // }

    default void print(){       // concrete method in interface
        private_func();
        System.out.println("Default method");
    }
    private void private_func(){
        System.out.println("private functoin");
    }

    // protected void protected_method(){}     // can't have protected methods 
}

interface Dog extends Animal{

}

class Cat implements Animal{
    
    public void makes_sound(){
        System.out.println("Cat meows");
    }
}

public class interfaces {
    public static void main(String[] args) {
        
        // Animal animal = new Animal();   // can't create ojects of interface
    }
}
