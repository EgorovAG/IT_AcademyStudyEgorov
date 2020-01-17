package task1;
//1. Изучить конструкцию try - catch - finally.
//        Попробовать разделить число на 0 и обработать эту ситуацию при помощи:
//        1.1 try - catch

public class Task1_1 {

    public static void main(String[] args) {
        Task1_1.method();
    }
        static void method() {
            int a=5;
            try {
                System.out.println(a / 0);
            }
            catch (Exception e){
                System.out.println("Ошибка при делении на 0");
            }
        }
    }

