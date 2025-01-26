package strings;
public class string_builder {
    public static void main(String[] args) {
        
        String str = "hello";
        StringBuilder sb = new StringBuilder("hello");

        // add new string
        sb.append(" world");
        System.out.println(str);
        System.out.println(sb);

        // length
        sb.length();
        
        // update char at index
        sb.setCharAt(2, 'a');

        // insert
        sb.insert(2, 'a');

        // substring
        sb.substring(1, 3);
        sb.substring(3);

        // reverse
        sb.reverse();

        // delete char at index
        sb.deleteCharAt(3);

        // delete substring
        sb.delete(2, 6);

        // replace substring
        sb.replace(4, 7, "abcdef");

        // equals function
        sb = new StringBuilder("str");
        StringBuilder sb1 = new StringBuilder("str");

        System.out.println(sb.equals(sb1)); // checks reference

        // convert string builder to string
        sb.toString();

        // convert string to string builder
        String str1 = "abc";
        sb = new StringBuilder(str1);
    }
}
