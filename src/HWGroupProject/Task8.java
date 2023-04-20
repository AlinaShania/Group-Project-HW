package HWGroupProject;

public class Task8 {
    public static void main(String[] args) {
        int [] numbers = {11,134,87,90,16};
        int largest = numbers[0];
        int smallest = numbers[0];
         for (int number : numbers) {
             if (number>largest){
                 largest=number;
        } if (number<smallest){
                 smallest=number;
             }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
