//2. Написать кодо который удалет элементы из списка во время цикла по нему.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<Passport> arrayListPassport = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 1_000; i++) {
            arrayListPassport.add(new Passport("MP" + random.nextInt(1_000_000), new Date(), "A B C"));
        }

        System.out.println(arrayListPassport.size());

        Iterator<Passport> iterator = arrayListPassport.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(arrayListPassport.size());

    }
}
