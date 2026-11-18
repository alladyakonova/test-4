package solvers;

import java.util.Scanner;

public class ForTaskSolver {
    static void main(String[] args) {

        //divisionByThree();

        // numbersToN();

        // multiplicationTable();

        //System.out.println(checkNumberIsSimple());

        printNumbers();

    }


    public static void divisionByThree () {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void numbersToN () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }

        System.out.println("Сумма чисел от 1 до n равна: " + sum);

    }

    public static void multiplicationTable () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 1; i < 10; i++) {
            result = i * n;
            System.out.println(n + " * " + i + " = " + result);
        }

    }



    public static boolean checkNumberIsSimple () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        boolean isPrime = true;


        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;

    }

    public static void printNumbers () {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }











}
