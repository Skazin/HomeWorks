package HomeWork2;

import java.util.Scanner;

public class HomeWork214 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                int a = i * j;
                System.out.print(j + " * " + i + " = " + a + "\t");
            }
            System.out.println(" ");
        }
    }
}
