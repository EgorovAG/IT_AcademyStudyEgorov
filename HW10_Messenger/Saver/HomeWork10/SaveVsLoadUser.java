package Saver.HomeWork10;

//4. Сохранять информацию о зарегестрированных пользователях в файл
// по завершению программы, загружать эту информацию из файла при запуске программы

import chat.Chat;
import registrationValidation.MyException;
import user.User;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SaveVsLoadUser {

    public void saveUser(Chat chat) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IDEAJAVA\\Egorov" +
                "\\Messenger\\src\\Saver\\HomeWork10\\SaveVsLoadUser.bin"))) {
            oos.writeObject(chat.getUserChatSet());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadUSer() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\IDEAJAVA\\Egorov" +
                "\\Messenger\\src\\Saver\\HomeWork10\\SaveVsLoadUser.bin"))) {
            Set<User> userChatSet1 = (Set<User>) ois.readObject();
            Chat chat1 = new Chat(userChatSet1);
            System.out.println(chat1.getUserChatSet());
        } catch (IOException | ClassNotFoundException | MyException e) {
            e.printStackTrace();
        }
    }
}
