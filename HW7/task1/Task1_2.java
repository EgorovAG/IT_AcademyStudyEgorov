//Домашнее задание:
//        1. Изучить конструкцию try - catch - finally.
//        Попробовать разделить число на 0 и обработать эту ситуацию при помощи:
//        1.2 try - finally

public class Task1_2 {
    public static void main(String[] args) {
        Task1_2.method();
    }
    static void method() {
        int a=5;
        try {
            System.out.println(a / 0);
            System.out.println("Разделило красиво");
        }
        finally {
            System.out.println("Сработал завершающий finally ");
        }
    }
}
