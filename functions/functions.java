package functions;
public class functions {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        functions obj = new functions();
        int ans = obj.sum(a, b);
        System.out.println(ans);

        int mul = multiply(a, b);
        System.out.println(mul);
    }

    int sum(int a, int b){
        return a+b;
    }

    static int multiply(int a, int b){
        return a * b;
    }
}

class function2{
    int a;
    int b;
}
