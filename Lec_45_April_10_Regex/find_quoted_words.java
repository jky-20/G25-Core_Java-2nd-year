package Lec_45_April_10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find_quoted_words {
    public static void main(String[] args) {
        String str = "Word of the day are \"Hello\" and \"Mate\"";
        String rex = "\"\\w*\"";

        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
