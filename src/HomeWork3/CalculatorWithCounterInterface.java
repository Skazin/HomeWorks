package HomeWork3;

public class CalculatorWithCounterInterface extends CalculatorWithMathExtends implements ICalculator {

    long i = 0l;

    CalculatorWithCounterInterface(ICalculator calc){

    }

    public long getCountOperation(){

        i++;
        return i;
    }

}



