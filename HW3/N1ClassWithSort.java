import java.util.Arrays;

public class N1ClassWithSort {
    public static void main(String[] args) {
        int array1[] = {3, 5, 7, 4, 1};
//        Sort.sortVibor(array1);
//        Sort.sortBubble(array1);
//        Sort.sortSheik(array1);
        Sort.sortVkluchenia(array1);

        System.out.println(Arrays.toString(array1));

    }
}
class Sort {
    //Метод сортировки выбором
   public static int[] sortVibor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minN = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minN = j;
                }
            }
            int empty = array[i];
            array[i] = min;
            array[minN] = empty;
        }
        return array;
    }
    //Метод сортировки пузырьками
    public static int[] sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minN = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minN = j;
                }
            }
            int empty = array[i];
            array[i] = min;
            array[minN] = empty;
        }
        return array;
    }
    //Метод сортировки Шейкерная
    public static int[] sortSheik(int[] array){
        int start = 0; // начало
        int end = array.length - 1; // конец

        do {
            //Сдвигаем с начала в конец
            for (int i = start; i < end; i++) {
                if(array[i] > array[i+1]) {
                    int b=array[i];
                    array[i] = array[i+1];
                    array[i+1] = b;
                }
            }
            end--; // уменьшаем правую границу
            //Сдвигаем слева направо
            for (int i = end; i > start ; i--) {
                if(array[i] < array[i-1]) {
                    int b=array[i];
                    array[i] = array[i-1];
                    array[i-1] = b;
                }
            }
            start++; // увеличиваем левую границу
        } while (start <= end);
       return array;
    }
    // Метод сортировки включением
    public static int[] sortVkluchenia(int[] array){
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
       return array;
    }
    //Метод сортировки слиянием

    //Метод сортирвки разделением


}







