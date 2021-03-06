import java.util.Arrays;

//СОРТИРОВКА ВЫБОРОМ
//Алгоритм:
//*начиная с начала массива просматриваем попарно по 2 элемента
// (первый со вторым, второй с третим, третий с четвертым и т.д.).
//*Если второй элемент в паре меньше первого элемента –
// перемещаем его на место первого, а первый на место второго.
// Это мы делаем для всех элементов.
//* После того, как мы дошли до конца массива (сравнили предпоследний
// и последний элементы и сделали обмен, если нужно), проверяем, был ли
// хотя бы один обмен. Если да, значит массив не отсортирован и
// начинаем все сначала. Повторяем такие проходы, пока не будет так,
// что мы проверили попарно все элементы от начала до конца,
// а обмена ни одного не было. Таким образом элементы с самыми маленькими
// значениями потихоньку перемещаются справа налево.
// То есть они как будто всплывают, как мыльный пузырь.
public class N3_2Sort2Bubble {
    public static void main(String[] args) {

        int[] array1 = new int[10];

        for (int k = 0; k < array1.length; k++) {
            array1[k] = (int) ((Math.random() * 11) - 5);
        }
        System.out.print(Arrays.toString(array1)+"\n");
        //пошла сортировочка
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; i < array1.length-1; i++) {
                if (array1[i] > array1[i + 1]) {
                    int empty = array1[i + 1];
                    array1[i + 1] = array1[i];
                    array1[i] = empty;
                }
            }
        }
        System.out.print(Arrays.toString(array1));
    }
}