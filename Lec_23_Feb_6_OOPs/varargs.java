package Lec_23_Feb_6_OOPs;

public class varargs {
    
    static void print(int... a){
        for(int i : a){
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("--------------------");
    }

    static void print(String a, int... b){};    // overload func with varargs

    // static void print(int... a, String b){};    // varargs must be the last parameter

    // static void print(int a, int... b){} // bad practice
    public static void main(String[] args) {
        
        print(1, 2,3,4,5);
        print(1,2,3,4);
        print(1,2,3,4,5,6,7,8,9);

        int[] arr = {1,2,3,4,5};
        print(arr);
    }
}
