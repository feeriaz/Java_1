/* Домашнее задание 2:
Написать метод, принимающий на вход 2 целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да - вернуть true, в противном случае - false.
 */
public class dz2 {
    private static boolean MoreLessHit (int a, int b) {
        int sum = a + b;
        return ((sum >= 10) && (sum <=20));
    }
public static void main (String[] args) {
        boolean f = MoreLessHit(15, 7);
        System.out.println(f);
}
}
