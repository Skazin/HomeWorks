package HomeWork3;

public class CalculatorWithMathCopy {

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

    public double degree (double a, double b){

        return Math.pow(a, b);
    }

    public double module (double a){

        return Math.abs(a);
    }

    public double squareRoot (double a){

        return Math.sqrt(a);
    }
}



