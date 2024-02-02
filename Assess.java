package asse;

import java.util.Scanner;

public class Assess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println(isSixtyFive(num1, num2));
    }

     static boolean isSixtyFive(int num1, int num2) {


            return num1 == 65 || num2 == 65 || (num1 + num2 == 65);

    }

}





