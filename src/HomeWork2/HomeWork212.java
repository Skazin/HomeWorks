package HomeWork2;

import java.util.Random;
import java.util.Scanner;

public class HomeWork212 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        in.close();
        multiplication(a);
    }
    static void multiplication (int a){
        StringBuilder count = new StringBuilder(Integer.toString(a));

        for (int i = 0; i < count.length(); i++) {
            char b = count.charAt(i);
            if (i == count.length() - 1) System.out.print(b + " ");
            else System.out.print(b + " * ");
        }
        int d = 1;

        for (int i = 0; i < count.length(); i++) {
            char b = count.charAt(i);
            int c = (int) b - '0';
            d *= c;
        }
        System.out.print("= " + d);
    }
}
