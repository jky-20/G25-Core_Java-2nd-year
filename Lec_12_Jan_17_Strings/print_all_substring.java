package Lec_12_Jan_17_Strings;
import java.util.Scanner;

public class print_all_substring {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int si=0 ; si<str.length() ; si++){
            for(int ei=si+1 ; ei<=str.length() ; ei++){
                System.out.println(str.substring(si, ei));
            }
        }
    }
}
