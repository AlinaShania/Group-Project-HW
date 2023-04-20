package HWGroupProject;

public class Task10 {
    public static void main(String[] args) {

        String [] words = {"Alina", "Denys","Daniel", "Tati", "Alina"};

        for (int i=0;i<words.length;i++){
            for (int j=i+1; j<words.length;j++){
                if (words[i]==words[j]){
                    System.out.println("The duplicate word is "+words[i]);
                }
            }
        }
    }
}
