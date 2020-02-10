package Saver;

import Saver.api.ISaverChatInFile;
import Saver.api.ISaverChatShow;
import chat.Chat;
import message.Message;
import user.User;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

public class SaverChat implements ISaverChatInFile, ISaverChatShow {

    @Override
    public void showSaverChat(Chat chat) {
        Set<User> userChatSet = chat.getUserChatSet();
        for (User user : userChatSet) {
            System.out.println(user);
        }

        List<Message> messageList = chat.getMessageList();
        for (Message message :
                messageList) {
            System.out.println(message);
        }
    }


    @Override
    public void saveFileChat(Chat chat) {
        List<Message> messageList = chat.getMessageList();
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("D:\\IDEAJAVA\\Egorov\\Messenger\\src" +
                                                                         "\\MessageSave.txt", true))) {
            writer.println(messageList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

