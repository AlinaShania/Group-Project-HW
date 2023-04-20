package HWGroupProject;

public class Task7 {
    public static void main(String[] args) {

        int fibNumbers [] = new int [10];
        int a = 0;
        int b = 1;
        fibNumbers[0]=a;
        fibNumbers[1]=b;
        for (int i=0; i<fibNumbers.length; i++ ){
            int c=a+b;
            fibNumbers[i]=c;
            a=b;
            b=c;
            System.out.println(fibNumbers[i]);
        }

    }
}
