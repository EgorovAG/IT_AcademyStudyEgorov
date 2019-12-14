import java.util.Arrays;

//СОРТИРОВКА ВЫБОРОМ
//Алгоритм:
// 1. Находим минимальный элемент в массиве.
// 2. Меняем местами минимальный и первый элемент местами.
// 3. Опять ищем минимальный элемент в неотсортированной части массива
// 4. Меняем местами уже второй элемент массива и минимальный найденный,
// потому как первый элемент массива является отсортированной частью.
// 5. Ищем минимальные значения и меняем местами элементы,
// пока массив не будет отсортирован до конца.
public class N3_1Sort1Vibor {
    public static void main(String[] args) {
        int[] array1 = new int[11];

        for (int k = 0; k < array1.length; k++) {
            array1[k] = (int) ((Math.random() * 11) - 5);
        }
        System.out.print(Arrays.toString(array1)+"\n");

        for ( int i = 0; i < array1.length; i++) {
            int min = array1[i];
            int minN = i;
            for (int j = i + 1; j < array1.length; j++) {
                if (min>array1[j]) {
                    min = array1[j];
                    minN = j;
                }
            }
            int empty = array1[i];
            array1[i] = min;
            array1[minN] = empty;
        }
        System.out.println(Arrays.toString(array1));
    }
}