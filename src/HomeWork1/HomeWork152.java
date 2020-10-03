package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork152 {

    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        in.close();
        if (Objects.equals(name1 , name) == true) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name1 , name) == false) {
            if (Objects.equals(name2 , name) == true) {
                System.out.println("Я тебя так долго ждал");
            } else System.out.println("Добрый день, а вы кто?");

        }
    }
}
