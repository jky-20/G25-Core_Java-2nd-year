public class string_demo2 {
    public static void main(String[] args) {
        
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = new String("abc");
        String str4 = "abc";

        System.out.println(str1.equals(str3));
        System.out.println("Strings in string pool : " + (str1 == str4));

        // in heap memory
        System.out.println("In heap memory space: " + (str2 == str3));
        System.out.println("In diff memory space : " + (str2 == str1));
        
        
        StringBuilder sb = new StringBuilder("Hello"); 
        sb.append(" World"); 
        sb.reverse(); 
        System.out.println(sb);


    }
}
