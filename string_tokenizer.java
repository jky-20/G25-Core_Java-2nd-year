import java.util.StringTokenizer;

public class string_tokenizer {
    public static void main(String[] args) {
        String str = "My name is Jai";
        StringTokenizer st = new StringTokenizer(str);

        str = "apple;mango;banana";
        st = new StringTokenizer(str, ";");

        st.countTokens();

        while (st.hasMoreTokens()) {
            st.nextToken();
        }
    }
}
