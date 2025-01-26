package strings;
import java.util.Scanner;

public class toggle_alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i=0 ; i<str.length() ; i++){
            char c = sb.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = ((char)(c - 'a' + 'A'));
            }
            if(c >= 'A' && c <= 'Z'){
                c = ((char)(c - 'A' + 'a'));
            }
            sb.setCharAt(i, c);
        }
        str = sb.toString();
        System.out.println(str);
    }
}
