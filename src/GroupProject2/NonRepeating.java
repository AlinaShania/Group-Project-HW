package GroupProject2;

public class NonRepeating {
    public static void main(String[] args) {
        String string = "abracadabra";

        for (char chars : string.toCharArray()){
            if (string.indexOf(chars) == string.lastIndexOf(chars)){
                System.out.println("First non repeat character is "+ chars);
              break;
            }
        }
    }

}
