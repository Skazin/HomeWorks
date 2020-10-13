package HomeWork3;

public class CalculatorWithOperator implements ICalculator {

    public double plus (double a, double b){
        double c;
        c = a + b;
        return c;
    }

    public double minus (double a, double b){
        double c;
        c = a - b;
        return c;
    }

    public double multiplication (double a, double b){
        double c;
        c = a * b;
        return c;
    }

    public double division (double a, double b){
        double c;
        c = a / b;
        return c;
    }

    public double degree (double a, int b){
        double c = a;
        for (int i = 1; i < b; i++) {
           c *= a;
        }
        return c;
    }

    public double module (double a){
        double c;
        if (a < 0) c = a * (-1);
        else c = a;
        return c;
    }

    public double squareRoot (double a){

        return Math.sqrt(a);
    }
}



