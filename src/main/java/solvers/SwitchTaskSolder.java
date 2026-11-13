package solvers;

import java.util.Scanner;

public class SwitchTaskSolder {
    static void main(String[] args) {

        // checkDayOfWeek();

        // checkPrice();

        transformMark();

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


    public static void commandReader () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");

    }

}
