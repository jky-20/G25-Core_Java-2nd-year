package Lec_23_Feb_6_OOPs;

class motor_vehicle{
    motor_vehicle(){
        System.out.println("Motor vehicle constructor");
    }
    void start(){
        System.out.println("Switch on the engine");
    }
    motor_vehicle get_vehicle(){
        return new motor_vehicle();
    }
    private void private_func(){
        System.out.println("Private function");
    }
    static void static_func(){
        System.out.println("static function");
    }
    final void final_func(){
        System.out.println("final function");
    }
}
class car extends motor_vehicle{
    void start(){
        System.out.println("Start by key");
    }
    // motor_vehicle get_vehicle(){
    //     return new motor_vehicle();
    // }
    // bike get_vehicle(){
    //     return new bike();
    // }
    car get_vehicle(){
        return new car();
    }
}
class bike extends motor_vehicle{
    // constructors can't be overrided
    // motor_vehicle(){
    //     System.out.println("Motor vehicle constructor");
    // }
    void start(){
        System.out.println("Start by Kick");
    }
    void private_func(){    // new class function ... not overrided
        System.out.println("Private function");
    }
    // void static_func(){     // static functions can't be overrided
    //     System.out.println("static function");
    // }
    static void static_func(){      // method hiding, not overirding
        System.out.println("static function");
    }
    // void final_func(){      // final functions can't be overrided
    //     System.out.println("final function");
    // }
}
public class overriding {
    public static void main(String[] args) {
        
        car c1 = new car();
        c1.start();     // calls overridded function
    }
}
