package HWGroupProject;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter any number between 0 and 20");
        int answer = scanner.nextInt();
        boolean a = false;

        for (int i=2;i< answer/2; i++) {
            if (answer % i == 0) {
                a = true;
                break;
            }
        }
        if(!a)
                System.out.println("The number you entered is a prime number");
        else System.out.println("The number you entered is not a prime number");
        }
    }

