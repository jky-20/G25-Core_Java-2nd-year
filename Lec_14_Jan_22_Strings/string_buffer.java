package Lec_14_Jan_22_Strings;
public class string_buffer {
    public static void main(String[] args) {
        String str = "hello";
        StringBuffer sb = new StringBuffer("hello");

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
        sb = new StringBuffer("str");
        StringBuffer sb1 = new StringBuffer("str");

        System.out.println(sb.equals(sb1)); // checks reference

        // convert string Buffer to string
        sb.toString();

        // convert string to string Buffer
        String str1 = "abc";
        sb = new StringBuffer(str1);
    }
}
