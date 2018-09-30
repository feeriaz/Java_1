/*
Написать метод, который определяет является ли год високосным.
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
Для проверки работы вывести результаты работы метода в консоль
 */
import java.util.Scanner;

public class dz5 {

    private static boolean leapyear (int year) {
        return year % 4 == 0 && ((year % 400 == 0) || (year % 100 != 0));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, год: ");
        int y = scan.nextInt();
        if (leapyear(y)) System.out.println(y + " - этот год високосный!");
        else System.out.println(y + "  - этот год не високосный.");

    }

}