import api.*;

public class Calc implements IDivision, ISum, IMult, ISubtract, IMemory,IRestore {
    private int a;
    private int b;
   static private int c;
   static public int mem ;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int division() {
        c=a/b;
        return a/b;
    }

    @Override
    public int mult() {
        c=a*b;
        return a*b;
    }

    @Override
    public int subtract() {
        c=a-b;
        return a-b;
    }

    @Override
    public int sum() {
        c=a+b;
        return a+b;
    }

    //Если объявить переменную статической, то она сохранится в памяти
    @Override
    public int memory() {
        mem = c;
        return mem ;
    }

    @Override
    public int restore() {
        return Calc.mem;
    }
}



