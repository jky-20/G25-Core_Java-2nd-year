package Lec_45_April_10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class remove_comment {
    public static void main(String[] args) {
        String str = "System.out.print(\"Hello\")   // prints Hello";
        String rex = "//.*";

        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);
        String without_comment = m.replaceAll("");
        System.out.println(without_comment);
    }
}
