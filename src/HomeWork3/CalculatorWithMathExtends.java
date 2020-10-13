package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {



    public double degree (double a, int b){

        return Math.pow(a, b);
    }

    public double module (double a){

        return Math.abs(a);
    }

  //  public double squareRoot (double a){    по сути так же не нужен, как и методы с базовыми математическими операциями, т.к в наследуемом классе для корня использован класс Math
  //
  //      return Math.sqrt(a);
  //  }
}



