package HomeWork3;

public class CalculatorWithCounterInterface implements ICalculator {

    private long i = 0l;
    private final ICalculator calc;

    CalculatorWithCounterInterface(ICalculator calc){
        this.calc = calc;
    }

    public void incrementCount() {
        this.i++;
    }

    public double plus (double a, double b){
        return this.calc.plus(a, b);
    }

    public double minus (double a, double b){
        return this.calc.minus(a, b);
    }

    public double multiplication (double a, double b){
        return this.calc.multiplication(a, b);
    }

    public double division (double a, double b){
        return this.calc.multiplication(a, b);
    }

    public double degree (double a, int b){
        return this.calc.degree(a, b);
    }

    public double module (double a){ // a < 0 ? -a : a (оптимальнее)
        return this.calc.module(a);
    }

    public double squareRoot (double a){
        return this.calc.squareRoot(a);
    }

    public long getCountOperation(){
        return i;
    }

}



