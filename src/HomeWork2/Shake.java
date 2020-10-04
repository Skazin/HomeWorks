package HomeWork2;

import java.util.Arrays;

public class Shake {


    public static void main(String[] args) {

        int[] arr1 = {9,1,5,99,9,9};
        System.out.println("Изначальный массив 1: " + Arrays.toString(arr1));

        int leftSide = 0;
        int rightSide = arr1.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) { // Сортир. влево ищем МАКС. знач.


                if (arr1[i] > arr1[i + 1]) {
                    int p = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = p;
                }
                System.out.println("Измененный массив 1: " + Arrays.toString(arr1));
            }
            rightSide--; // Уменьшаем количество проходов
            for (int i = rightSide; i > leftSide; i--) { // Теперь идём в обратную сторону ищем МИН.
                if (arr1[i] < arr1[i - 1]) {
                    int p = arr1[i];
                    arr1[i] = arr1[i - 1];
                    arr1[i - 1] = p;
                }
                System.out.println("Измененный массив 1: " + Arrays.toString(arr1));
            }
            leftSide++; // Уменьшаем количество проходов т.к. мы шли с конца исходя из условия
            // последнего for, что бы уменьшить кол-во проходокб нужно инкрементировать счётчик
        } while (leftSide < rightSide);
        System.out.println("Измененный массив 1: " + Arrays.toString(arr1));



    }

}
