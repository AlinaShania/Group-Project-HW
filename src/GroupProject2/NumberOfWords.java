package GroupProject2;

public class NumberOfWords {
    public static void main(String[] args) {
        String a = "Hello, world!";
        String [ ] array = a.split("[,.!?]");
        System.out.println(array.length);
    }
}
