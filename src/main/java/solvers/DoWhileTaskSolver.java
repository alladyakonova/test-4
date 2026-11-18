package solvers;

import java.util.Scanner;

public class DoWhileTaskSolver {
    static void main(String[] args) {

        // askNumber();

        // checkPassword();

        // printNumbersTo10();

        // checkCommand();

        countNumbers();

    }


    public static void askNumber () {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
            System.out.println("Число положительное");



    }

    public static void checkPassword () {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
        } while (!password.equals("admin"));
        System.out.println("Аутентификация успешна");


    }


    public static void printNumbersTo10 () {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);


    }

    public static void checkCommand () {
        Scanner scanner = new Scanner(System.in);
        String command = "";

        do {
            System.out.println("Введите команду для завершения работы: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));

        System.out.println("Программа завершила работу");


    }


    public static int countNumbers () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int sign = 0;

        do {
            number = number / 10;
            sign++;
        } while (number >= 1);

        System.out.println("Цифр в числе: " + sign);
        return sign;


    }


}
