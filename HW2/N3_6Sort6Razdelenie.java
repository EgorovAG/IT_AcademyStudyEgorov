
//Сортировка с разделением

//Использует известную стратегию «разделяй и властвуй».
//Речь идёт о том, чтобы разбивать задачу на подзадачи до той поры,
//пока перед нами не будет элементарная единица. В нашем случае
//массив делится на несколько массивов, а каждый из них сортируется
//отдельно, а потом объединяется в один массив.
//Пошаговое описание алгоритма сортировки:
//1.Выбираем опорный элемент из массива. Как правило, это средний элемент.
//2.Делим массив на 2 подмассива. Элементы, которые меньше опорного, и элементы, которые больше опорного.
//3.Рекурсивно применяем сортировку к обоим подмассивам.
//В результате массивы будут делиться до тех пор, пока не останется один элемент, который потом отсортируется.



import java.util.Arrays;

public class N3_6Sort6Razdelenie {
    public static void main(String[] args) {
        int[] x = {8, 0, 4, 7, 3, 7};
        System.out.println("До сортировки");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("После сортировки");
        System.out.println(Arrays.toString(x));
    }


    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}


