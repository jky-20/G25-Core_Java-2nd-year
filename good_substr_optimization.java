import java.util.Scanner;

public class good_substr_optimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int max_len = 0;
        int len = 0;

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
                || str.charAt(i)=='o' || str.charAt(i)=='u'){
                    len++;
                    if(len > max_len){
                        max_len = len;
                    }
            }
            else{
                len = 0;
            }
        }
        System.out.println("Length of longest good substring is : " + max_len);
    }
}
