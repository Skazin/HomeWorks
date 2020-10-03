package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork151 {

    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        in.close();
        if (Objects.equals(name1, name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name2, name)) {
                System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(name1, name) && !Objects.equals(name2, name)){
            System.out.println("Добрый день, а вы кто?");
        }

    }
}

