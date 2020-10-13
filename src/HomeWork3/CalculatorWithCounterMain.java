package HomeWork3;

public class CalculatorWithCounterMain {

    public static void main(String[] args) {

    CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    CalculatorWithCounter count = new CalculatorWithCounter(calc);

        double a = count.multiplication(15.0,7.0);
        count.getCountOperation();
        double b = count.division(28.0, 5.0);
        count.getCountOperation();
        double c = count.plus(a, b);
        count.getCountOperation();
        double d = count.plus(4.1, c);
        count.getCountOperation();
        double e = count.degree(d, 2);
        long q = count.getCountOperation();

        System.out.println("15 * 7 = " + a);
        System.out.println("28 / 5 = " + b);
        System.out.println("15 * 7 + 28 / 5 = " + c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) = " + d);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + e);

        System.out.println("Количество использований калькулятора: " + q);

    }
}
