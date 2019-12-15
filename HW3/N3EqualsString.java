
import java.util.Scanner;

public class N3EqualsString {
    public static void main(String[] args) {
        String str1="Мама мыла раму";
        Scanner s = new Scanner(System.in);
        System.out.println("Введите выражение: \"Мама мыла раму\"");
        String str = s.nextLine();
        System.out.println(str1==str.intern()); //метод intern() Смотрит, есть ли строка с таким текстом в пуле строк
    }
}


