package GroupProject2;

public class Reverse {

    public static void main(String[] args) {
        String word = "Hello";
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();

        for (int i=sb.length()-1; i>=0; i--){
            System.out.println(sb);
            break;
        }
    }

}
