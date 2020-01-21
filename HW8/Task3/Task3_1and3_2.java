package Task3;

//3. Написать дженерик класс FilterApplicator который умеет обрабатывать
// коллекцию ЛЮБЫХ элементов будет иметь следующие методы:
// 3.1. статический метод filter. У метода filter будет
//два параметра. 1 коллекция в которой будет происходить
//фильтрация, 2 класс который реализует алгоритм фильтрации.
// И будет возвращать результат фильтрации
//3.2. статический ДЖЕНЕРИК МЕТОД sort который будет принимать 1 параметр
// коллекцию элементов реализующих интерфейс Comparable. И будет возвращать
// результат сортировки

import java.util.*;

public class Task3_1and3_2 {
    public static void main(String[] args) {

       List<SortComparable> list = new ArrayList<>();
       list.add(new SortComparable("MP 555"));
       list.add(new SortComparable("MP 112"));
       list.add(new SortComparable("MP 124"));
       list.add(new SortComparable("MP 543"));
       list.add(new SortComparable("MP 123"));

        System.out.println("Коллекция: ");
        for (SortComparable s: list) {
            System.out.println(s);
        }

        System.out.println("Коллекция после сортировки:");
        Collection collect = FilterApplication.sort(list);
        for (Object o: collect) {
            System.out.println(o);
        }

        List list1 = new ArrayList();
        list1.add(123);
        list1.add("Stas");
        list1.add("Tolia");
        list1.add(12345);

        System.out.println("Коллекция: ");
        for (Object o: list1) {
            System.out.println(o);
        }

        System.out.println("Коллекция list1 после фильтра");
        FilterApplication.filter(list1, new Filtr());
        for (Object o : list1) {
            System.out.println(o);
        }
    }
}

