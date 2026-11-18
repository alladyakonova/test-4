package solvers;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    static void main(String[] args) {

        // sumToNegative();

       // printNumbersWithoutThree();

        // printPositive();

        checkString();

    }

public static void sumToNegative () {
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    int b = 0;

    int sum = 0;

    while ( a == a && b == b) {
        System.out.println("Введите число a: ");
        a = scanner.nextInt();
        System.out.println("Введите число b: ");
        b = scanner.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("Одно из чисел или оба числа отрицательные");
            break;
        }
        sum = a + b;
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
    }


}


public static void printNumbersWithoutThree () {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);

        }


}


public static void printPositive () {
        Scanner scanner = new Scanner(System.in);

    while (0 == 0) {

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            continue;
        }
        System.out.println(number);
    }

}

public static void checkString () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                System.out.println("Процесс завершен");
                break;
            }

        }
}


}
