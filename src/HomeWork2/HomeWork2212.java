package HomeWork2;

import java.util.Scanner;

public class HomeWork2212 {
    public static void main(String[] args) {

        int[] arr = generate(5);
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }



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
