package HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork212 {
    public static void main(String[] args) {

        multiplication(args);
    }
    static void multiplication (String[] args){
        int a = Integer.parseInt(args[0]);
        StringBuilder count = new StringBuilder(Integer.toString(a));

        for (int i = 0; i < count.length(); i++) {
            char b = count.charAt(i);
            if (i == count.length() - 1) System.out.print(b + " ");
            else System.out.print(b + " * ");

        }
        int d = 1;
        int c = 0;

        for (int i = 0; i < count.length(); i++) {
            char b = count.charAt(i);
            c = (int) b - '0';
            d *= c;
        }
        System.out.print("= " + d);
    }
}
