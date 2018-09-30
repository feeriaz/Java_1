/*
Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль.
Проверить положительное ли число передали, или отрицательное.
Замечание: ноль считаем положительным числом.
Результат работы метода вывести в консоль
 */
import java.util.Scanner;

public class dz3 {
 private static boolean negpoz(int number){
     return number >=0;
 }

    public static void main(String args[]){
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (negpoz(num)) System.out.println(num + " - это положительное число");
        else System.out.println(num + " - это отрицательное число");

    }
    }

