package HomeWork1;

import java.util.Arrays;

public class HomeWork16 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println(createPhoneNumber(numbers));

    }
    public static String  createPhoneNumber(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + " - " + numbers[6] + numbers[7] + numbers[8] + numbers[9];

    }

}
