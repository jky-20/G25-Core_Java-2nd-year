package Lec_45_April_10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {
    public static void main(String[] args) {
        
        String str = "Today's date is 10th April 2025 and next year is 2026";
        String rex = "\\d{4}";

        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.println(m.group());
            System.out.println("Start : " + m.start() + " || end: " + m.end());
        }

        String replaced = m.replaceAll("####");
        String replacedFirst = m.replaceFirst("####");
        System.out.println(replaced);
        System.out.println(replacedFirst);
    }
}
