package HWGroupProject;

public class Task4 {
    public static void main(String[] args) {
        int [][] numbers ={
                {12,4,21,4,15},
                {11,7,6,14,13},
                {3,7,9,4,5}
        };
        int evenSum = 0;
        int oddSum = 0;
        for (int i=0;i<numbers.length; i++) {
            for (int j=0;j<numbers[i].length;j++) {
            int element = numbers[i][j];
                if (element %2==0){
                    evenSum=evenSum+element;
                } else {
                    oddSum = oddSum + element;
                }
                }
            }
        System.out.println(evenSum);
        System.out.println(oddSum);

    }
}
