package Lec_18_Jan_29_OOPs;
class Car{
    private String brand;
    private String color;
    int speed;

    Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // copy constructor
    Car(Car other){
        this.brand = other.brand;
        this.color = other.color;
        this.speed = other.speed;
    }

    String getBrand(){
        return this.brand;
    }

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }

    void print(){
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }

}

public class copy_constructor {
    public static void main(String[] args) {

        Car car1 = new Car("Nano", "Yellow", 40);
        car1.print();
        System.out.println("______________________________");
        Car car2 = new Car(car1);
        car2.print();
    }
}
