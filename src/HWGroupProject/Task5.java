package HWGroupProject;

public class Task5 {
    public static void main(String[] args) {

        int num1=14, num2=16;
        System.out.println("Number 1 before swapping is "+num1+" and Number 2 before swapping is "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping Number 1 is "+num1+" and Number 2 is "+num2);

    }
}
