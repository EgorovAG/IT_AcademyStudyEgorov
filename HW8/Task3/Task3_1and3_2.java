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

import java.util.Set;
import java.util.TreeSet;

public class Task3_1and3_2 {
    public static void main(String[] args) {

       Set<SortComparable> set = new TreeSet<>();
       set.add(new SortComparable("Stas"));
       set.add(new SortComparable("Petr"));
       set.add(new SortComparable("Igor"));
       set.add(new SortComparable("Ula"));
       set.add(new SortComparable("Inna"));

        for (SortComparable s: set) {
            System.out.println(s);
        }



        }


    }

