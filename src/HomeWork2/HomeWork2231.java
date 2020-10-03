package HomeWork2;

import java.util.Scanner;

public class HomeWork2231 {
    public static void main(String[] args) {

        int[] arr = generate(5);
        int i = arr.length - 1;
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 0);



    }
    public static int[] generate(int count) {

        int[] arr = new int [count];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
