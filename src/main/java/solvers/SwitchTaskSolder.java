package solvers;

import java.util.Scanner;

public class SwitchTaskSolder {
    static void main(String[] args) {

        // checkDayOfWeek();

        // checkPrice();

        //transformMark();

        // commandReader();

        calculator();

    }




    public static String checkDayOfWeek () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        int day = scanner.nextInt();
        String dayOfWeek;

        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }
        System.out.println(dayOfWeek);
        return dayOfWeek;

    }

    public static int checkPrice () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        int day = scanner.nextInt();
        int price = 0;

        switch (day) {
            case 1, 2, 3, 4, 5:
                price = 300;
                break;
            case 6, 7:
                price = 450;
        }
        System.out.println("Стоимость билета составляет: " + price + " рублей");
        return price;

    }

    public static void transformMark () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество баллов: ");
        int point = scanner.nextInt();

        if (point >= 90 && point <= 100) {
            System.out.println("Ваша оценка: A");
        } else if (point >= 80 && point <= 89) {
            System.out.println("Ваша оценка: B");
        } else if (point >= 70 && point <= 79) {
            System.out.println("Ваша оценка: C");
        } else if (point >= 60 && point <= 69) {
            System.out.println("Ваша оценка: D");
        } else if (point < 60 && point >= 0) {
            System.out.println("Ваша оценка: F");
        } else {
            System.out.println("Неверные данные");
        }


    }


    public static String commandReader () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");
        String runCommand = scanner.nextLine();
        String command;

        switch (runCommand) {
            case "start":
                command = "Система запущена";
                break;
            case "stop":
                command = "Система остановлена";
                break;
            case "restart":
                command = "Система перезапущена";
                break;
            case "status":
                command = "Система работает";
                break;
            default:
                command = "Команда не распознана";
        }
        System.out.println(command);
        return command;


    }

    public static void calculator () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        String a = scanner.nextLine();
        System.out.println("Введите число b: ");
        String b = scanner.nextLine();
        System.out.println("Введите оператор для чисел a и b: ");
        String operator = scanner.nextLine();


        int result = 0;

        if (!b.equals("0")) {

            switch (operator) {
                case "*":
                    result = Integer.parseInt(a) * Integer.parseInt(b);
                    break;
                case "/":
                    result = Integer.parseInt(a) / Integer.parseInt(b);
                    break;
                case "+":
                    result = Integer.parseInt(a) + Integer.parseInt(b);
                    break;
                case "-":
                    result = Integer.parseInt(a) - Integer.parseInt(b);
                    break;
            }
            System.out.println("Результат вычисления равен: " + result);

        } else {
           System.out.println("Деление на ноль недопустимо");
        }

    }
}
