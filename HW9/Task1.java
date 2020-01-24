import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 1. Выполнить Поиск в строке "Я люблю JAVA" при помощи регулярного
//выражения (h*, h+, h?). Объяснить в комментариях к коду почему
//работает и не работает все три примера для метода find и matches
public class Task1 {
    public static void main(String[] args) {
        String str = "Я люблю JAVA";
//Метод matches() — в Java сообщает, соответствует ли или нет данная строка заданному регулярному выражению
        System.out.println(str.matches("h*")); //false, т.к."h*"-  этому регулярному выражению соответсвует что
                                                     // это должна быть буква h 0 или больше раз
        System.out.println(str.matches("h+")); //false, т.к."h+"-  этому регулярному выражению соответсвует что
                                                      // это должна быть буква h 1 или больше раз
        System.out.println(str.matches("h?"));  //false, т.к."h?"-  этому регулярному выражению соответсвует что
                                                      // это должна быть буква h 0 или 1 раз
        Pattern pattern = Pattern.compile("h*");  //  h 0 или больше раз // false, тут везде 0 (совпадает 0 раз)
        Pattern pattern1 = Pattern.compile("h+"); //  h 1 или больше раз  // true так как даже 1 раза нет h
        Pattern pattern2 = Pattern.compile("h?");  // h 0 или 1 раз  // false,  тут везде 0 (совпадает 0 раз)
        Matcher matcher= pattern.matcher(str);
        Matcher matcher1= pattern1.matcher(str);
        Matcher matcher2= pattern2.matcher(str);
//Метод find() — проверяет поэлементно и преходит на совпадающий элемент с true или false если нет совпадений
        System.out.println("совпадения в строке:");
        while (matcher.find()){
            System.out.print(matcher.start() +" ");
        }

        System.out.println();
        System.out.println("совпадения в строке:");
        while (matcher1.find()){
            System.out.print(matcher1.start() +" ");
        }
        System.out.println("совпадения в строке:");
        while (matcher2.find()){
            System.out.print(matcher2.start() +" ");
        }
    }
}
