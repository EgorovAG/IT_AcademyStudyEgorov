//2. Написать свой класс в котором будет:
//2.1 метод который принимает 1 параметр, его обрабатывает и
//выбрасывать чекед эксепшн (который вы должны написать сами) при условиях заданных вами
//2.2 Класс который будет наследовать предыдущий класс и
//перекрывать написанный вами метод и добавлять туда свой чекед эксепшн (новый написанный также вами)

package task2;

import task2.api.MyException2;
import task2.api.MyException2_1;

public class Task2_2 {
    public static void main(String[] args)  {
        Task task = new Taske();
        try {
            task.method(11);
        } catch (MyException2 myException2) {
            System.out.println("вы ввели 'a' больше 2 и меньше 11");;
        } catch (MyException2_1 myException2_1) {
            System.out.println("вы ввели 'a'больше 10");
        }

    }
}
class Task{
    private int a;

    public  void method(int a) throws MyException2, MyException2_1 {
        int b = 3- ++a;
        if (b<0) {throw new MyException2("Ошибка ");}
        System.out.println(b);
    }
}
class Taske extends Task{
    @Override
    public void method(int a) throws MyException2_1 {
        int b = 10 - a;
        if (b<0) {throw new MyException2_1("Ошибка b<0");}
    }
}



