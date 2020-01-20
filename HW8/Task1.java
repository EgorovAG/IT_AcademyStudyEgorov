//1. Написать пример, в котором рандомно генерируется 1 000 000 паспортов
// (чем больше тем лучше, может не хватить памяти) и сохраняются в ArrayList,
// LinkedList. При помощи system.currenttimemillis() замерить добавление элементов
// в лист, замерить скорость удаление элементов из листа и вывести значение.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        long s;
        List<Passport> arrayListPassport = new ArrayList<>();
        List<Passport> linkedListPassport = new LinkedList<>();

        Random random = new Random();
        s = System.currentTimeMillis();
        for (int i = 0; i <1_000_000 ; i++) {
            arrayListPassport.add(new Passport("MP" +random.nextInt(1_000_000),new Date(),"A B C"));
        }
        System.out.println("add 1_000_000 element in ArrayList: " + (System.currentTimeMillis()- s) + " millisec");

        s = System.currentTimeMillis();
        for (int i = 0; i <1_000_000 ; i++) {
            linkedListPassport.add(new Passport("MP" +random.nextInt(1_000_000),new Date(),"A B C"));
        }
        System.out.println("add 1_000_000 element in LinkedList: " + (System.currentTimeMillis()-s) + " millisec");
        System.out.println("Количество элементов ArrayList: " + arrayListPassport.size());
        System.out.println("Количество элементов LinkedList: "+ linkedListPassport.size());

        s = System.currentTimeMillis();
        //Version 1
//        for (int i = 0; i<1_000_000; i++) {  //удаляет долго, т.к. каждый раз копирует массив и смещает влево
//             arrayListPassport.remove(0);
//        }
        //Version 2
        for (int i = 999_999; i>=0; i--) {
             arrayListPassport.remove(i);
        }

        //Version 3
//        Iterator<Passport> iterator = arrayListPassport.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }

        System.out.println("remove 1_000_000 element in ArrayList: " + (System.currentTimeMillis()-s) +" millisec");

        s = System.currentTimeMillis();
        //Version1
        for (int i = 0; i<1_000_000; i++) {
            linkedListPassport.remove(0);
        }

        //Version 2
//        for (int i = 999_999; i>=0; i--) {
//            linkedListPassport.remove(i);
//        }

        //Version 3
//        Iterator<Passport> iterator = linkedListPassport.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }
        System.out.println("remove 1_000_000 element in LinkedList: " + (System.currentTimeMillis()-s) +" millisec" );

        System.out.println("Количество элементов после удаления ArrayList: " + arrayListPassport.size());
        System.out.println("Количество элементов после удаления LinkedList: "+ linkedListPassport.size());





    }
}
