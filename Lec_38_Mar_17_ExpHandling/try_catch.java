package Lec_38_Mar_17_ExpHandling;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b;
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
            // try{ // nexted try-catch
                int[] arr = new int[2];
                System.out.println(arr[2]);
            // }
            // catch(ArrayIndexOutOfBoundsException ex){
            //     System.out.println(ex.getMessage());
            // }
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
            System.out.println("Can't divide by zero");
            System.out.println("please enter another num");
            b = sc.nextInt();
            System.out.println(a / b);
        }
        finally{
            System.out.println("Always execute");
        }
        System.out.println("Hello All!!!");
    }
}
