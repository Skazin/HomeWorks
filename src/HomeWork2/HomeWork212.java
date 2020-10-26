package HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork212 {
    public static void main(String[] args) {

        multiplication(args);
    }
    static void multiplication (String[] args){
        StringBuilder count = new StringBuilder(Arrays.toString(args));

        for (int i = 0; i < count.length(); i++) {
            char b = count.charAt(i);
            if (b != '[' && b!= ']'){
                if (i == count.length() - 2) System.out.print(b + " ");
                else System.out.print(b + " * ");
            }
        }
        int d = 1;
        int c = 0;

        for (int i = 0; i < count.length(); i++) {
            char b = count.charAt(i);
            if (b != '[' && b!= ']'){
                c = (int) b - '0';
                d *= c;}
        }
        System.out.print("= " + d);
    }
}
