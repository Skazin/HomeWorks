package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Burbles {


    public static void main(String[] args) {

        int[] arr1 = {8,1,5,99,9,7};
        System.out.println("Изначальный массив 1: " + Arrays.toString(arr1));

        for (int out = arr1.length - 1; out >= 1; out--) {

            for (int in = 0; in < out; in++) {

                if (arr1[in] > arr1[in + 1]){
                    int p = arr1[in];
                    arr1[in] = arr1[in + 1];
                    arr1[in + 1] = p;
                }
                System.out.println("Измененный массив 1: " + Arrays.toString(arr1));
            }
        }
        System.out.println("Измененный массив 1: " + Arrays.toString(arr1));

        int[] arr2 = {1,1,1,1};
        System.out.println("Изначальный массив 2: " + Arrays.toString(arr2));

        for (int out = arr2.length - 1; out >= 1; out--) {

            for (int in = 0; in < out; in++) {

                if (arr2[in] > arr2[in + 1]){
                    int p = arr2[in];
                    arr2[in] = arr2[in + 1];
                    arr2[in + 1] = p;
                }
            }
        }
        System.out.println("Измененный массив 2: " + Arrays.toString(arr2));

        int[] arr3 = {9,1,5,99,9,9};
        System.out.println("Изначальный массив 3: " + Arrays.toString(arr3));

        for (int out = arr3.length - 1; out >= 1; out--) {

            for (int in = 0; in < out; in++) {

                if (arr3[in] > arr3[in + 1]){
                    int p = arr3[in];
                    arr3[in] = arr3[in + 1];
                    arr3[in + 1] = p;
                }
            }
        }
        System.out.println("Измененный массив 3: " + Arrays.toString(arr3));
    }

}
