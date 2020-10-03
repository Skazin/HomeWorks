package HomeWork2;

import java.util.Scanner;

public class HomeWork213 {
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       System.out.print("Введите число: ");
       double count = in.nextDouble();
       System.out.print("Введите возводимую степень: ");
       int rate = in.nextInt();
       in.close();
       double result = count;
        for (int i = 1; i < rate ; i++) {
            result *= count;
        }
        System.out.println("Число " + count + " в степени " + rate + " = " + result);



    }
}
