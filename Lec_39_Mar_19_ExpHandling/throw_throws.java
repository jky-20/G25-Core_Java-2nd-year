package Lec_39_Mar_19_ExpHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw_throws {
    static void function() throws FileNotFoundException{
        FileReader file = new FileReader("test.txt");

        // throw new ArrayIndexOutOfBoundsException("Index not in Range");
        try{
            int a = 10;
            System.out.println(a/0);
        }
        catch(ArithmeticException ex){
            throw ex;
        }
    }
    public static void main(String[] args) {
        try{
            function();
        }
        catch(FileNotFoundException ex){
            System.out.println("Enter Valid FileName");
        }
    }
}
