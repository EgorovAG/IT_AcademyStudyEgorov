package Saver.HomeWork10;

//2. Создать сейвер который будет сохранять
// чат в бинарный файл при помощи ObjectOutputStream

import chat.Chat;
import message.Message;

import java.io.*;
import java.math.BigInteger;

public class SaverWriteBinnaryChat {

    public void savWriteBinnaryChat(Chat chat) {
        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("D:\\IDEAJAVA\\Egorov" +
                "\\Messenger\\src\\Saver\\HomeWork10\\SaverWriteBinnaryChat.bin"))) {
            for (Message mess: chat.getMessageList()) {
                String text =mess.toString();
                ois.writeObject(new BigInteger(text.getBytes()).toString(2));
            }
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

