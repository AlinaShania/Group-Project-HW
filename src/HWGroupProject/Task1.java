package HWGroupProject;

public class Task1 {
    public static void main(String[] args) {
        int[] temperatures = {68, 71, 67, 89, 59, 80, 81};
        int highestTemp = temperatures[0];
        int lowestTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemp) {
                highestTemp = temperatures[i];
            }else if (temperatures[i]<lowestTemp) {
                lowestTemp = temperatures[i];
            }
        }
        System.out.println("The highest temperature for the week was " + highestTemp);
        System.out.println("The lowest temperature for the week was "+ lowestTemp);

    }
}
