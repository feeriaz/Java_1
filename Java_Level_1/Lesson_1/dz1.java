/* Домашнее задание 1:
Написать метод, вычисляющий выражение a * (b + (c / d))
и возвращающий результат с плавающей точкой, где
a, b, c, d - целочисленные входные параметры этого метода.
 */

public class dz1 {
    private static double raschet (int a, int b, int c, int d) {
      double result = a * (b + (c / d));
      return result;
    }
    public static void main (String[] args) {
        double x = raschet (6, 3, 10, 2);
        System.out.println("Результат: " + x);
    }
}
