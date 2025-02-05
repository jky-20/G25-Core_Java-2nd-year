package Lec_22_Feb_5_OOPs;

public class method_overloading {
    
    // static int add(int a){
    //     return a;
    // }
    static int add(long a){
        return 10;
    }
    static int add(int a, int b){   // overloading by changing no. of arguments
        return a + b;
    }
    static int add(String a, int b){    // overloading by changing data type of arguments
        return 10;
    }
    static int add(int a, String b){    // overloading by changing order of arguments
        return 20;
    }
    // static String add(int a, int b){    // can't overload by changing return type
    //     return "Null";
    // }
    public static void main(String[] args) {
        
        System.out.println(add(10));
        System.out.println(add(10, 20));

        int a = 10;
        System.out.println(add(a));
    }
}
