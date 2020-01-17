//5)Написать метод который будет выбрасывать чекед и
// анчекед эксепшены при разных условиях. Поместить вызов
// данного метода в try блок и обработать эти эксепшенами
// двумя разными кэтч блоками. Повторить тоже самое только
// обработать одним кэтч блокам не используя Throwable класс.

import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        //или один catch
        try {
            method();
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
    public static void method() throws IOException, IllegalArgumentException{

    }
}
