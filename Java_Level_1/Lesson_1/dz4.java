/*
Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
Вывести приветствие в консоль.
 */
public class dz4 {
    private static String helloname (String name) {
       return name;
    }

    public static void main (String[] args) {
        String nam = helloname ("Шапокляк");
        System.out.println("Привет, " + nam);
    }
}