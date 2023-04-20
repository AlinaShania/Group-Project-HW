package HWGroupProject;

public class Task3 {
    public static void main(String[] args) {

        int [][] numbers ={
                {12,15,14,16,17},
                {34,56,87,90,58,43},
                {1,2,3,4,5,6},
        };
        for (int i=0; i<numbers.length; i++){
            for (int j=0;j<numbers[i].length; j++){
                int element = numbers [i][j];
                if (element %2==0){
                    System.out.print(element+" ");
                }
            }
        }
    }
}
