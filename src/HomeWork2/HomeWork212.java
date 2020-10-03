package HomeWork2;

import java.util.Scanner;

public class HomeWork212 {
    public static void main(String[] args) {

       // Scanner in = new Scanner(System.in);
       // System.out.print("Введите число: ");
       // int count = in.nextInt();
       // in.close();
        int a = Integer.MAX_VALUE;
        StringBuilder s = new StringBuilder();
        System.out.println(a);
        while (a > 0){
            s.insert(0, a % 10);
            a /= 10;
        }
        System.out.println(s.toString());


    }
}
