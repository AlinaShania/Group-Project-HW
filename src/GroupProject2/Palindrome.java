package GroupProject2;

public class Palindrome {
    boolean isPalindrome (String str ){

        String reversedStr = "";
        for (int i=str.length()-1; i>=0;i--){
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome= true;
        }
        return isStrPalindrome;

    }


    public static void main(String[] args) {
        Palindrome task2 = new Palindrome();
        boolean result = task2.isPalindrome("car");
        System.out.println(result);
    }
}
