package HomeWork3;

public class CalculatorWithCounter {

    private long i = 0l;
    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;


    CalculatorWithCounter (CalculatorWithOperator calc){
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }
    CalculatorWithCounter (CalculatorWithMathCopy calc){
        this.calc2 = calc;
        this.calc1 = null;
        this.calc3 = null;
    }
    CalculatorWithCounter (CalculatorWithMathExtends calc){
        this.calc3 = calc;
        this.calc1 = null;
        this.calc2 = null;
    }

    public void incrementCount() {
        this.i++;
    }

    public double plus (double a, double b){
        this.incrementCount();
        if(this.calc1 != null){
            return this.calc1.plus(a, b);
        } else if (this.calc2 != null){
            return this.calc2.plus(a, b);
        }
        return this.calc3.plus(a, b);
    }

    public double minus (double a, double b){
        this.incrementCount();
        if(this.calc1 != null){
            return this.calc1.minus(a, b);
        } else if (this.calc2 != null){
            return this.calc2.minus(a, b);
        }
        return this.calc3.minus(a, b);
    }

    public double multiplication (double a, double b){
        this.incrementCount();
        if(this.calc1 != null){
            return this.calc1.multiplication(a, b);
        } else if (this.calc2 != null){
            return this.calc2.multiplication(a, b);
        }
        return this.calc3.multiplication(a, b);
    }

    public double division (double a, double b){
        this.incrementCount();
        if(this.calc1 != null){
            return this.calc1.multiplication(a, b);
        } else if (this.calc2 != null){
            return this.calc2.multiplication(a, b);
        }
        return this.calc3.multiplication(a, b);
    }

    public double degree (double a, int b){
        this.incrementCount();
        if(this.calc1 != null){
            return this.calc1.degree(a, b);
        } else if (this.calc2 != null){
            return this.calc2.degree(a, b);
        }
        return this.calc3.degree(a, b);
    }

    public double module (double a){ // a < 0 ? -a : a (оптимальнее)
        this.incrementCount();
        if(this.calc1 != null){
            return this.calc1.module(a);
        } else if (this.calc2 != null){
            return this.calc2.module(a);
        }
        return this.calc3.module(a);
    }

    public double squareRoot (double a){
        this.incrementCount();
        if(this.calc1 != null){
            return this.calc1.squareRoot(a);
        } else if (this.calc2 != null){
            return this.calc2.squareRoot(a);
        }
        return this.calc3.squareRoot(a);
    }

    public long getCountOperation(){

        return i;
    }

}



