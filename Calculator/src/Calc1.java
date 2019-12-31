import api.*;

public class Calc1 implements ICalc {
   private int a;
    private int b;
   static private int c;
   static int mem ;

    public int var(int a){
        this.a=a;
        return a;
    }

    @Override
    public int division(int b) {
        c=a/b;
        a=c;
        return a;
    }

    @Override
    public int mult(int b) {
        c=a*b;
        a=c;
        return a;
    }

    @Override
    public int subtract(int b) {
        c=a-b;
        a=c;
        return a;
    }

    @Override
    public int sum(int b) {
        this.b=b;
        c=a+b;
        a=c;
        return a;
    }

    //Если объявить переменную статической, то она сохранится в памяти
    @Override
    public int memory() {
        mem = c;
        return mem ;
    }

    @Override
    public int restore() {
        b=Calc1.mem;
        return b;
    }
}



