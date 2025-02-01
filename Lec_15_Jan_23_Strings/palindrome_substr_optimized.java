package Lec_15_Jan_23_Strings;
import java.util.Scanner;

public class palindrome_substr_optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans = 0;

        // for odd substrings
        for(int i=0 ; i<str.length() ; i++){
            for(int l=i, r=i ; l>=0 && r<str.length() ; l--, r++){
                if(str.charAt(l) != str.charAt(r)){
                    break;
                }
                ans++;
            }
        }

        // for even substrings
        for(int i=0 ; i<str.length() ; i++){
            for(int l=i, r=i+1 ; l>=0 && r<str.length() ; l--, r++){
                if(str.charAt(l) != str.charAt(r)){
                    break;
                }
                ans++;
            }
        }
        System.out.println("No. of palindrome substrings are : " + ans);
    }
}
