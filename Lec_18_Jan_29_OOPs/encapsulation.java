package Lec_18_Jan_29_OOPs;
class car{
    private String brand;
    private String color;
    int speed;

    car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;

        // this.print();       // calling method using this
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

public class encapsulation {
    public static void main(String[] args) {
        
        car car1 = new car("Volvo", "Pink", 120);
        // car1.brand = "Tata";     // Private data member
        System.out.println(car1.getBrand());

        car1.setColor("Black");
        System.out.println(car1.getColor());
        System.out.println("________________________");
        car1.print();
    }
}
