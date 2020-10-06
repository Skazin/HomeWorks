package HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArraysForSort extends Sort {


    public static void main(String[] args) {

        int count = (int) (Math.random() * 100);
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,1,1,1};
        int[] arr3 = {9,1,5,99,9,9};
        int[] arr4 = {};
        int[] arr5 = randomArr(count);
        int[] arr6 = handwrittenArr(6);


        shake(arr6);
        arr6 = handwrittenArr(6); // иначе сортирует уже отсортированный массив
        burbles(arr6);

    }
    public static int[] randomArr(int count){
        int[] arr = new int[count];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        return arr;
    }
    public static int[] handwrittenArr(int count) {

        int[] arr = new int [count];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
