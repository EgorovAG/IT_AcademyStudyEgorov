import java.util.Arrays;
import java.util.Scanner;

public class N1ClassWithSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array lenght=");
        int c = sc.nextInt();
        if (c<0) {
            System.out.print("Enter natural number=");
            c = sc.nextInt();
        }

        int[] array1 = new int[c];

        for (int k = 0; k < array1.length; k++) {
            array1[k] = (int) ((Math.random() * 21) - 10);
        }
        System.out.println("Before sort;");
        System.out.println(Arrays.toString(array1));

            System.out.println("Enter number method sorting");
            System.out.println("1-Sort Vibor");
            System.out.println("2-Sort Bubble");
            System.out.println("3-Sort Sheik");
            System.out.println("4-Sort Vkluchenia");
            System.out.println("5-Sort Slianiem");
            System.out.println("6-Sort Razdeleniem");
            int x=sc.nextInt();
            switch (x){
                case(1):
                    Sort.sortVibor(array1);
                    break;
                case(2):
                    Sort.sortBubble(array1);
                    break;
                case(3):
                    Sort.sortSheik(array1);
                    break;
                case(4):
                    Sort.sortVkluchenia(array1);
                    break;
                case(5):
                    Sort.sortSlianiem(array1);
                    break;
                case(6):
                    Sort.sortRazdeleniem(array1);
                    break;
                default:
                    System.out.println("You entered an invalid number");
            }
            System.out.println("After sort:");
            System.out.println(Arrays.toString(array1));
    }
}

class Sort {

    //МЕТОД СОРТИРОВКА ВЫБОРОМ

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

    //МЕТОД СОРТИРОВКА ПУЗЫРЬКАМИ

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

    //МЕТОД ШЕЙКЕРНАЯ СОРТИРОВКА

    public static int[] sortSheik(int[] array) {
        int start = 0; // начало
        int end = array.length - 1; // конец

        do {
            //Сдвигаем с начала в конец
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;
                }
            }
            end--; // уменьшаем правую границу
            //Сдвигаем слева направо
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    int b = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = b;
                }
            }
            start++; // увеличиваем левую границу
        } while (start <= end);
        return array;
    }

    // Метод сортировки включением
    public static int[] sortVkluchenia(int[] array) {
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

    //МЕТОД СОРТИРОВКА СЛИЯНИЕМ

    public static int[] sortSlianiem(int[] array) {


        //  N1ClassWithSort s = new N1ClassWithSort();

        sort(array, 0, array.length - 1);

        return array;
    }




// слияние двух подмассивов arr[].
// первый подмассив arr[st..mid]
// второй подмассив arr[mid+1..end]

        static void merge(int arr[], int st, int mid, int end) {

            // находим размеры двух подмассивов для слияния
            int n1 = mid - st + 1;
            int n2 = end - mid;

            /* Создаем временные массивы массивы */
            int L[] = new int[n1];
            int R[] = new int[n2];

            /*Копируем данные во временные массивы*/
            for(int i=0; i<n1; ++i)
                L[i] = arr[st + i];
            for(int j=0; j<n2; ++j)
                R[j] = arr[mid + 1+ j];

            /* Слияние временных массивов */

            // Инициализируем индексы первого и второго подмассивов

            int i = 0, j = 0;

            // Initial index of merged subarray array
            // Инициализируем индекс объединенного массива подмассива
            int k = st;
            while(i < n1 && j < n2)
            {
                if(L[i] <= R[j])
                {
                    arr[k] = L[i];
                    i++;
                }
                else
                {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            /* Скопировать оставшиеся элементы L[] если есть */
            while(i < n1)
            {
                arr[k] = L[i];
                i++;
                k++;
            }

            /* Скопировать оставшиеся элементы R[] если есть */
            while(j < n2)
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Main функкция которая сортиует arr[l..r] используя
        // merge()

        public static void sort(int arr[], int l, int r) {

            if(l < r)
            {
                // Поиск средней точки
                int m = (l+r)/2;

                // Сортировка первой и второй половинки
                sort(arr, l, m);
                sort(arr , m+1, r);

                // Слияние сортрованных половинок
                merge(arr, l, m, r);
            }
        }


    //МЕТОД СОРТИРОВКА РАЗДЕЛЕНИЕМ

    public static int[] sortRazdeleniem(int[] array) {

        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);
        return array;

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










