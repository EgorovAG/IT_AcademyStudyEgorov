
import java.util.Arrays;
import java.util.Scanner;

public class N4Array {
    public static void main(String[] args) {
        int n, i;
        int[] array;

// Ввод массива c исключением отрицательного числа для длины
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array=");
        n = s.nextInt();
        if (n<0) {
            while (n < 0) {
                System.out.println("Enter positive number= ");
                n = s.nextInt();
            }
        }
            array = new int[n];

        for ( i = 0; i < n; i++) {
            System.out.print("Enter " + i + " array element=");
            array[i] = s.nextInt();
        }
        System.out.println("\n"+"Array");
        System.out.print(Arrays.toString(array));

//Сортировка Bubble
        boolean sort =true;
        while (sort) {
            sort = false;
            for ( i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int empty = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = empty;
                    sort = true;
                }
            }
        }
        System.out.println("\n"+"Sort array");
        System.out.println(Arrays.toString(array));

//Удаление дублей

        int unique = 1;
        for( i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){
                unique++; //Если текущий с предыдущим не равны - значит
                // увеличиваем счетчик уникальных значений
            }
        }
        int[] result = new int[unique]; //Новый массив нужного размера
        int k = 0; //Текущая позиция в новом массиве
        if(result.length > 0){
            result[k++] = array[0]; //Пишем в новый массив первое уникальное значение
        }
        for( i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){
                result[k++] = array[i]; //Пишем в новый массив остальные уникальные значения
            }
        }

//УДАЛЯЕМ ДУБЛИРОВАННЫЕ ЭЛЕМЕНТЫ МАССИВА
        int c =array.length;

        //создаем массив с такой же длиной как и у старого массива
        int[] temp = new int[c];

        //обходим все элементы и ищем совпадения
        int q=0;
        for ( i = 0; i < c-1 ; i++) {
            //если текущий элемент не равен следующему ,то сохраняем
            //текущий элемент
            if (array[i]!=array[i+1]) {
                temp[q++]=array[i];
            }
        }
        //и сохраняем последний элемент
        temp[q++] = array[c - 1];

        //модифицируем первоночальный массив, а именно присваиваем каждому
        //элементу соответсвующий элемент массива temp

        for ( i = 0; i < q; i++)
            array[i] = temp[i];

        //выводим элементы нашего массива
        System.out.println("Array without replay");
        System.out.print("[");
        for ( i = 0; i < q; i++)
            System.out.print(array[i] + " ");
        System.out.println("]");
    }
}

