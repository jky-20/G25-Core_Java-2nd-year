package Lec_45_April_10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find_date {
    public static void main(String[] args) {
        String str = "Today's date is 10-04-2025";
        String rex = "(\\d{2})-(\\d{2})-(\\d{4})";

        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(str);

        if(m.find()){
            System.out.println("Date : " + m.group(1));
            System.out.println("Month : " + m.group(2));
            System.out.println("Year : " + m.group(3));
        }

    }
}
