package Task3;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class FilterApplication<T> {
    public static Collection filter(Collection collection, Filtr filtr ){
        filtr.filter1(collection);
        return collection;

    }

    public static <T extends Comparable> Collection sort(Collection<T> collection){
        Set<T> set = new TreeSet<>(collection);
        return set;
    }
}
