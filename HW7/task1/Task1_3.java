package task1;
//Домашнее задание:
//        1. Изучить конструкцию try - catch - finally.
//        Попробовать разделить число на 0 и обработать эту ситуацию при помощи:
//               1.3 try - catch - finally

public class Task1_3 {
    public static void main(String[] args) {
        Task1_3.method();
    }
    static void method() {
        int a=5;
        try {
            System.out.println(a / 0);
            System.out.println("Разделило красиво");
        } catch (Exception e){
            System.out.println("Ошибка при делении на 0");
        }
        finally {
            System.out.println("Сработал завершающий finally");
        }
    }
}
