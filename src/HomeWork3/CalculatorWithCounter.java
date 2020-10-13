package HomeWork3;

public class CalculatorWithCounter extends CalculatorWithMathExtends implements ICalculator {

    long i = 0l;

    CalculatorWithCounter (CalculatorWithOperator calc){

    }
    CalculatorWithCounter (CalculatorWithMathCopy calc){

    }
    CalculatorWithCounter (CalculatorWithMathExtends calc){

    }

    public long getCountOperation(){

        i++;
        return i;
    }

}



