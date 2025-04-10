package Lec_44_April_9_Regex;

import java.util.regex.Pattern;

public class regexp {
    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[abc]", "ab")); // false
        System.out.println(Pattern.matches("[abc]", "a"));  // true
        System.out.println(Pattern.matches("[abc]", "z"));  // false
        
        System.out.println(Pattern.matches("[^abc]", "z"));  //true
        System.out.println(Pattern.matches("[^abc][^abc]", "10"));  // true
        
        System.out.println(Pattern.matches("[a-z0-9]", "Z"));  // false
        System.out.println(Pattern.matches("[a-z && A-Z]", "z"));  // false

        System.out.println(Pattern.matches("[abc]+", "aabbbacccaaa"));  // true
        System.out.println(Pattern.matches("[abc]+", ""));  // false
        System.out.println(Pattern.matches("[abc]+", "aabbbacccaadaa"));    // false

        
        System.out.println(Pattern.matches("[abc]*", "aabbbacccaaa"));  // true
        System.out.println(Pattern.matches("[abc]*", ""));      // true
        System.out.println(Pattern.matches("[abc]*", "aabbbacccaadaa")); // false

        System.out.println(Pattern.matches("[a-z]?[0-9]+", "aa1234"));
        System.out.println(Pattern.matches("[a-z]?[0-9]+", "c1234"));
        System.out.println(Pattern.matches("[a-z]?[0-9]+", "1234"));
        System.out.println(Pattern.matches("[a-z]?[0-9]+", "b"));

        
        System.out.println(Pattern.matches("[0-9]{2}", "87"));
        System.out.println(Pattern.matches("[0-9]{3,}", "78512345673"));
        System.out.println(Pattern.matches("[0-9]{3,9}", "23456734"));

        System.out.println(Pattern.matches("[a-z]+[0-9]+[a-z]+", "abcgd567hafvh"));
    }
}
