package HomeWork2;

import java.util.Scanner;

public class HomeWork2234 {
    public static void main(String[] args) {

        int[] arr = generate(5);
        for (int i : arr) {
            System.out.print(i + " ");
        }



    }
    public static int[] generate(int count) {

        int[] a = new int [count];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        for (int i = count; i >= 0; i--) {
            a[i-1] = in.nextInt();
        }
        return a;
    }
}
