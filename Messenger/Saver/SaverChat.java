package Saver;

import Saver.api.ISaverChat;
import chat.Chat;
import message.Message;
import user.User;

import java.util.List;
import java.util.Set;

public class SaverChat implements ISaverChat {

    @Override
    public void save(Chat chat) {
        Set<User> userChatSet = chat.getUserChatSet();
        for (User user :userChatSet) {
            System.out.println(user);
        }

        List<Message> messageList = chat.getMessageList();
        for (Message message:
             messageList) {
            System.out.println(message);

        }



//        System.out.println(chat.getUserChatSet());
//        System.out.println(chat.getMessageList());

        }

    }

