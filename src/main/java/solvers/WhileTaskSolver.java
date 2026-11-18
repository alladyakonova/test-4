package solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    static void main(String[] args) {

        // countFactorial();

        // printAllParityNumbersToN();

        countdown();

    }

    public static void countFactorial () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= number) {
            result = result * i;
            i++;
        }

        System.out.println("Факториал числа " + number + " равен " + result);


    }

    public static void printAllParityNumbersToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;

        while (i < n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }




    }

public static void countdown () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите положительное число: ");
    int number = scanner.nextInt();
    if (number <= 0) {
        System.out.println("Число не является положительным");
    } else {
        while (number > 0 ) {
            System.out.println(number);
            number --;

        }
    }

}


}
