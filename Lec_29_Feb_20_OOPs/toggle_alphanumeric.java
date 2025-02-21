package Lec_29_Feb_20_OOPs;

public class toggle_alphanumeric {
    public static void main(String[] args) {
        
        String str = "ab5CD2eFg3h12IjkY";
        
        // toggle string using wrapper class methods
        StringBuilder sb = new StringBuilder(str);
        for(int i=0 ; i<sb.length() ; i++){
            char ch = sb.charAt(i);
            if(Character.isDigit(i)){
                continue;
            }
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            else{
                ch = Character.toLowerCase(ch);
            }
            sb.setCharAt(i, ch);
        }
        str = sb.toString();
        System.out.println(str);
    }
}
