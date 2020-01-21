package Task3;

import java.util.Collection;
import java.util.Iterator;

public class Filtr {
    public void filter1(Collection collection){
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            if (iterator.next() instanceof Number)   // фильтр если
                iterator.remove();
        }
    }
}
