//3. Написать программу которая будет обрабатывать ввод в консоль.
// Наполнять массив int тем что введут из консоли,
// давать не более трёх ошибочных попыток подряд на ввод через консоль.
//4. Полученный массив через консоль преобразовать в коллекцию
//  и отсортировать данную коллекцию по возрастанию.


package task3_task4;

import task3_task4.api.MyException3;

import java.util.*;

public class Task3_Task4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
//        Scanner qw = new Scanner(System.in);

        System.out.print("Введите длину массива: ");

            Integer [] s = new Integer[new Scanner(System.in).nextInt()];

//        int l = qw.nextInt();
//        Integer [] s = new Integer[l];
        System.out.println("Заполните массив натуральными числами");
        for (int i = 0; i < s.length ; i++) {
           // s[i] = null;
            int count = 0;
            for (int j = 0; j <3 ; j++) {
                System.out.printf("Введите %d целое число: ", i + 1);
                try {
                    s[i] = Integer.valueOf(sc.nextLine());
                    if (s[i]!=null) {break ;}
                } catch (Exception e) {
                    count++;
                    if (s[i] == null&&count<3) {
                        System.out.println(String.format("Неверный ввод, осталось попыток: %d  ", (3-count)));
                    } else
                        throw new MyException3("you are loser HA-HA-HA");
                }
            }
        }

        List<Integer> list = new ArrayList<>(Arrays.asList(s));
        System.out.print("Введенные числа ");
        System.out.println(list);
        Collections.sort(list);
        System.out.print("Отсортированная коллекция ");
        System.out.println(list);

    }
}

