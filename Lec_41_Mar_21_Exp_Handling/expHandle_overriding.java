package Lec_41_Mar_21_Exp_Handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class parent{
    void NonExceptionFunction(){
        System.out.println("This method does not throw exception");
    }
    void ThrowsExceptionFunction() throws IOException{
        System.out.println("This function throws Exception");
    }
    parent func(){
        return new parent();
    }
}
class child1 extends parent{
    @Override 
    void NonExceptionFunction() throws IndexOutOfBoundsException{
        System.out.println("Overwride");
        int[] arr = new int[2];
        System.out.println(arr[4]);
    }
    // @Override
    // void ThrowsExceptionFunction() throws SQLException{
    //     System.out.println("This function throws Exception but not subtype of exception in super method");
    // }
}
class child2 extends parent{
    // @Override 
    // void NonExceptionFunction() throws FileNotFoundException{
    //     System.out.println("Throws Checked Exception");
    // }
    @Override
    void ThrowsExceptionFunction() throws FileNotFoundException{
        System.out.println("This function throws Exception which is subtype of exception thorwn in super method");
    }
    @Override
    child1 func(){
        return new child1();
    }
}

public class expHandle_overriding {
    public static void main(String[] args) {
        
    }
}
