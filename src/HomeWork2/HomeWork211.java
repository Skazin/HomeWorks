package HomeWork2;

import java.util.Random;
import java.util.Scanner;

public class HomeWork211 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int count = in.nextInt();
        in.close();
        multiplication(count);
    }
    public static void multiplication (int count){
        int comp = 1;
        for (int i = 1; i <= count; i++) {
            comp *= i;
            if (i == count) System.out.print(i + " ");
            else System.out.print(i + " * ");
        }
        System.out.print("= "  + comp);
    }
}
