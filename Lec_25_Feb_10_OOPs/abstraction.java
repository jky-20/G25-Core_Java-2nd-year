package Lec_25_Feb_10_OOPs;

abstract class MotorVehicle{
    abstract void start();
    void print(){
        System.out.println("Abstract Class");
    }
    // can have contructors and data members
}

class Car extends MotorVehicle{
    void start(){
        System.out.println("Starts from Key");
    }
}

abstract class Bike extends MotorVehicle{
    // if not provided the implementation of abstract method then class should also be abstract
}

public class abstraction {
    public static void main(String[] args) {

        // cannot make objects of abstract class
        // MotorVehicle mv = new MotorVehicle();
    }
}
