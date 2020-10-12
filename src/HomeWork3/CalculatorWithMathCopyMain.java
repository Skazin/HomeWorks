package HomeWork3;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {

    CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    double a = calc.multiplication(15.0,7.0);
    double b = calc.division(28.0, 5.0);
    double c = calc.plus(a, b);
    double d = calc.plus(4.1, c);
    double e = calc.degree(d, 2);

        System.out.println("15 * 7 = " + a);
        System.out.println("28 / 5 = " + b);
        System.out.println("15 * 7 + 28 / 5 = " + c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) = " + d);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + e);



    }
}
