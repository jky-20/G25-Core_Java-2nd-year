package Lec_17_Jan_27_OOPs;

class car{
    String brand;
    String color;
    int speed;

    car(){      // user made default constructor
        brand = "";
        color = "White";
        speed = 60;
    }
    car(String b, String c, int s){
        brand = b;
        color = c;
        speed = s;
    }

    void print(){
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }

    static void display(){
        System.out.println("A static method");

        // brand = "tata"; // can't do this, gives error

        // accessing non-static data members
        car temp = new car();
        temp.brand = "tata";
    }
}

public class class_and_obj {
    public static void main(String[] args) {
        
        car.display(); // calling static methods / members

        car car1 = new car();
        car1.brand = "Nexon";
        car1.color = "Black";
        car1.speed = 100;
        car1.print();

        car car2 = new car("Kia", "Grey", 110);
        car2.print();;
    }
}
