package Saver.HomeWork10;

//1. Создать сейвер для сохранения чата который будет
// сохранять сообщения в текстовый файл используя toString();

import chat.Chat;
import message.Message;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SaverWriteWithToString {
    public void savWriteWithToString(Chat chat){
        try ( PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\IDEAJAVA\\Egorov\\Messenger\\src" +
                "\\Saver\\HomeWork10\\SaverWriteWithToString.txt"))){
            for (Message mess : chat.getMessageList()) {
                pw.println(mess.toString());
            }
        }
         catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
