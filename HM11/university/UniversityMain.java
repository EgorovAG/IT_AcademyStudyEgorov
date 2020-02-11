package university;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class UniversityMain {

    static int i = 0;

    public static int id() {
        return ++i;
    }

    public static String name() {
        Random random = new Random();
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s.append(a.charAt(random.nextInt(a.length())));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        List<Student> list ;

        SaveToString saveToString = new SaveToString();
        SaverObjekt saver = new SaverObjekt();
        LoaderObjekt loader = new LoaderObjekt();

        File file = new File("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                "\\src\\university\\file1.txt");
        if (file.exists()) {
            list =loader.loadFile(file);
        } else {

//            генерируем список студентов
                    list = Stream
                            .generate(() -> new Student(id(), name(), new Random().nextInt(11)))
                            .limit(100)
                            .collect(toList());
                    saver.saveFile("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                            "\\src\\university\\file1.txt", list);
                    saveToString.saveString("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                            "\\src\\university\\file1String.txt", list);
        }


            //фильтруем студентов у которых балл меньше 7
            List<Student> list1 = list.stream()
                    .filter(Student -> Student != null)
                    .filter(x -> x.getScore() < 7)
                    .collect(toList());
            saver.saveFile("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file2.txt", list1);
            saveToString.saveString("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file2String.txt", list1);


            //сортируем по баллу
            List<Student> list2 = list1.stream()
                    .filter(Student -> Student != null)
                    .sorted(Comparator.comparing(Student::getScore))
                    .collect(toList());
            saver.saveFile("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file3.txt", list2);
            saveToString.saveString("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file3String.txt", list2);


            //переворачиваем
            List<Student> list3 = list2.stream()
                    .filter(Student -> Student != null)
                    .sorted(Comparator.comparing(Student::getScore).reversed())
                    .collect(toList());
            saver.saveFile("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file4.txt", list3);
            saveToString.saveString("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file4String.txt", list3);


            // отфильтровываем random 3 чела из этого списка, которые получат сертификат и удаляем их из списка
            List<Student> list4 = list3.stream()
                    .filter(Student -> Student != null)
                    .limit(list3.size() - 3)
                    .collect(toList());

            saver.saveFile("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file5.txt", list4);
            saveToString.saveString("D:\\IDEAJAVA\\Egorov\\HoweWork11" +
                    "\\src\\university\\file5String.txt", list4);
    }
}


