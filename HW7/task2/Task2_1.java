//2. Написать свой класс в котором будет:
//2.1 метод который принимает 1 параметр, его обрабатывает и
//выбрасывать чекед эксепшн (который вы должны написать сами) при условиях заданных вами
//2.2 Класс который будет наследовать предыдущий класс и
//перекрывать написанный вами метод и добавлять туда свой чекед эксепшн (новый написанный также вами)

package task2;

import task2.api.MyException2;
import task2.api.MyException2_1;

public class Task2_1 {
    public static void main(String[] args) {
        Taskk taskk = new Taskk();
        try {
            taskk.method(5);
        } catch (MyException2 myException2) {
            System.out.println("Возникла ошибка, число 'a' должно быть меньше 5 ");
        }

    }
}
class Taskk{
    private int a;

    public  void method(int a) throws MyException2 {
        int b = 5- ++a;
        if (b<0) {throw new MyException2("Ошибка a>2");}
        System.out.println(b);
    }
}
