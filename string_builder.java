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
    }
}
