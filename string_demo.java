public class string_demo {
    public static void main(String[] args) {
        
        String str = "Hello";
        System.out.println(str);
        
        str.concat(" World!");
        System.out.println(str);

        str = str.concat(" World!");
        System.out.println(str);
        
        str = "abcdef";

        // length
        System.out.println(str.length());

        // char at index
        System.out.println(str.charAt(2));

        // compare
        System.out.println(str.equals("Abc")); // str = abc

        // to upercase
        System.out.println(str.toUpperCase());

        // substring  (str = abcdef)
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));

        // concat
        System.out.println(str.concat("abc"));

        // contains
        System.out.println(str.contains("abc"));

        // replace
        System.out.println(str.replace("abc", "ABC"));
    }
}
