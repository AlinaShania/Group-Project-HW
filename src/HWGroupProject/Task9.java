package HWGroupProject;

public class Task9 {
    public static void main(String[] args) {

        int [] numbers = {11,134,87,90,16};
        int largest = 0;
        int secondLargest = 0;
        for (int i=0;i<numbers.length; i++) {

                if (numbers[i]>largest){
                    secondLargest=largest;
                    largest = numbers[i];
                } else if (numbers[i]>secondLargest){
                    secondLargest=numbers[i];
            }
        }
        System.out.println(secondLargest);

    }
}
