package HomeWork2;

import java.util.Arrays;

public class Sort {


    protected static void shake (int[] arr) { // шейкерная сортировка

        System.out.println("Изначальный массив: " + Arrays.toString(arr));

        int leftSide = 0;
        int rightSide = arr.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) { // проход слева направо


                if (arr[i] > arr[i + 1]) {
                    int p = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = p;
                }
            }
            rightSide--; // уменьшение правого предела

            for (int i = rightSide; i > leftSide; i--) { // проход справа налево
                if (arr[i] < arr[i - 1]) {
                    int p = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = p;
                }
            }
            leftSide++; // уменьшение левого предела
        } while (leftSide < rightSide);

        System.out.println("Измененный массив : " + Arrays.toString(arr));
    }

    protected static void burbles (int[] arr) { // пузырьковая сортировка

        System.out.println("Изначальный массив: " + Arrays.toString(arr));

        for (int out = arr.length - 1; out >= 1; out--) { //установка границ проходов

            for (int in = 0; in < out; in++) { // проход слева направо

                if (arr[in] > arr[in + 1]) {
                    int p = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = p;
                }
            }
        }
        System.out.println("Измененный массив : " + Arrays.toString(arr));
    }

}
