package Lec_39_Mar_19_ExpHandling;

public class Question {
    public static void main(String[] args) {
        try{
            int[] arr = new int[3];
            System.out.println(arr[3]);
        }
        catch(ArithmeticException ex){
            System.out.println("Index out of Bound");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("Hello...!!!");
    }
}
