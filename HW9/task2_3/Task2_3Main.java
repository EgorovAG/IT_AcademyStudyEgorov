package task2_3;

//2. Найти в книге "Война и мир"
// при помощи обычного поиска по строке и при помощи регуляных выражений.
//3. Реализацию поиска сделать при помощи классов и интерфейсов. Вывести
// информацию как часто встречаются строки "война", "и" (как союз), "мир".
// Дать возможность через аргументы программы выбрать какое слово будем искать в тексте

import java.io.File;
import java.io.FileNotFoundException;

public class Task2_3Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("d:/IDEAJAVA/Egorov/HomeWork9/src/warAndPeace.txt");
        Task task1 = new Task("война", file);
        Task task2 = new Task("и", file);
        Task task3 = new Task("мир", file);
        System.out.println("   Поиск при помощи regex:");
        task1.counterReg();
        task2.counterReg();
        task3.counterReg();
        System.out.println("\n   Обычный поиск по строке");
        task1.counterString();
        task2.counterString();
        task3.counterString();
    }
}
