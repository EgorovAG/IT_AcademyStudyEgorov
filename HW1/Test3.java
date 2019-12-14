import java.util.Objects;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя Вася или Анастасия: ");
        String name = in.nextLine();

//V1.1 if
        if (Objects.equals(name,"Вася")){  //или if (name.equals("Вася")){
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else {
            if (Objects.equals(name,"Анастасия")) {    //или if (name.equals("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }



//V1.2 if
//        if (Objects.equals(name,"Вася")){  //или if (name.equals("Вася")){
//            System.out.println("Привет");
//            System.out.println("Я тебя так долго ждал");
//        }
//         if (Objects.equals(name,"Анастасия")) {    //или if (name.equals("Анастасия")) {
//            System.out.println("Я тебя так долго ждал");
//        }
//        if (!Objects.equals(name,"Вася")&&!Objects.equals(name,"Анастасия")) {  //или  if (!name.equals("Вася")&&!name.equals("Анастасия")) {
//            System.out.println("Добрый день, а вы кто?");
//        }


// V2 else if
//        if (Objects.equals(name,"Вася")){  //или if (name.equals("Вася")){
//            System.out.println("Привет");
//            System.out.println("Я тебя так долго ждал");
//        }
//        else if(Objects.equals(name,"Анастасия")){ //или else if (name.equals("Анастасия")) {
//        System.out.println("Я тебя так долго ждал");
//        }
//        else {
//            System.out.println("Добрый день, а вы кто?");
//        }


//V3 switch
//        switch(name) {
//            case "Вася":
//                System.out.println("Привет");
//            case "Анастасия":
//                System.out.println("Я тебя так долго ждал");
//                break;
//            default:
//                System.out.println("Добрый день, а вы кто?");
//        }

        in.close();
    }
}
