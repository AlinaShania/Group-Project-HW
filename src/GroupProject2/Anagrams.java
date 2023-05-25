package GroupProject2;

import java.util.Arrays;

public class Anagrams {


    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() == str2.length()) {
            char[] charStr1 = str1.toCharArray();
            char[] charStr2 = str2.toCharArray();

            Arrays.sort(charStr1);
            Arrays.sort(charStr2);

            boolean result = Arrays.equals(charStr1, charStr2);

            if (result) {
                System.out.println("these two strings are anagrams");
            } else {
                System.out.println("these two strings are not anagrams");
            }
        } else {
            System.out.println("these two strings are not anagrams");
        }
    }
}

