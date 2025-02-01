package Lec_15_Jan_23_Strings;
import java.util.Scanner;

public class palindrome_substrings {
    static boolean check_palindrome(String str, int si, int ei){
        while(si<ei){
            if(str.charAt(si) != str.charAt(ei)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt = 0;

        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<str.length() ; j++){
                if(check_palindrome(str, i, j)){
                    cnt++;
                }
            }
        }
        System.out.println("No. of palindrome substrings are : " + cnt);
    }
}
