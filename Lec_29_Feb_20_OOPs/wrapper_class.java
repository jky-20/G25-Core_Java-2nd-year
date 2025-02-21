package Lec_29_Feb_20_OOPs;

public class wrapper_class {
    public static void main(String[] args) {
        
        Integer a = 10;
        int b = new Integer(10);

        String str = Integer.toString(100); // converts int to string
        b = Integer.parseInt("122345"); // converts string to int

        int abc = Integer.parseInt("101010", 2);
        str = Integer.toBinaryString(abc);

        System.out.println(Integer.compare(2, 3));
        Integer.min(10, 20);
        Integer.max(20, abc);

        // Character wrapper class
        char ch = 'a';
        Character.toUpperCase(ch);
        Character.isLowerCase(ch);
        Character.isLetter(ch);
        Character.isDigit(ch);
    }
}
