package solvers;

import java.util.Scanner;

public class IfElseTaskSolver {
    static void main(String[] args) {
        // checkNumber();

        // checkMax();

        //checkMarks();

        // checkParity();

        // checkAge();

        checkTestMark();

    }


    public static void checkNumber () {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        }
        else if (number == 0) {
            System.out.println("Число равно 0");
        } else {
            System.out.println("Число отрицательное");
        }


    }


    public static void checkMax () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        int a = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Большее из чисел:" + a);
        } else if (b > a) {
            System.out.println("Большее из чисел:" + b);
        } else {
            System.out.println("Числа равны");
        }


    }

    public static String checkMarks () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку: ");
        int mark = scanner.nextInt();

        String textMark;

        switch (mark)  {
            case 1, 2:
                textMark = "Неудовлетворительно";
                break;
            case 3:
                textMark = "Удовлетворительно";
                break;
            case 4:
                textMark = "Хорошо";
                break;
            case 5:
                textMark = "Отлично";
                break;
            default:
                textMark = "Данные введены неверно";

        }
        System.out.println("Оценка: \"" + textMark + "\"");
        return textMark;
    }

    public static String checkParity () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
            System.out.println(parity);
            return parity;
        } else {
            System.out.println(parity);
            return parity;
        }

    }

    public static void checkAge () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраcт: ");
        int age = scanner.nextInt();

        if (age < 18 && age > 0) {
            System.out.println("Ваша скидка составляет 25%");
        } else if (age >= 65) {
            System.out.println("Ваша скидка составляет 30%");
        } else if (age < 65 && age >= 18) {
            System.out.println("У вас нет скидки");
        } else {
            System.out.println("Неверный возраст");
        }
    }

    public static void checkTestMark () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите результат теста: ");
        int testMark = scanner.nextInt();

        if (testMark >= 90 && testMark <= 100) {
            System.out.println("Ваша оценка: \"Отлично\"");
        } else if (testMark >= 75 && testMark <= 89) {
            System.out.println("Ваша оценка: \"Хорошо\"");
        } else if (testMark >= 60 && testMark <= 74) {
            System.out.println("Ваша оценка: \"Удовлетворительно\"");
        } else if (testMark >= 0 && testMark < 60){
            System.out.println("Ваша оценка: \"Неудовлетворительно\"");
        } else {
            System.out.println("Неверные данные");
        }

    }

}
