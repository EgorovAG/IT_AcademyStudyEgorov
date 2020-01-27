package chat;

import Saver.SaverChat;
import message.Message;
import user.User;

import java.util.*;

public class Chat {
    Set<User> userChatSet = new HashSet<>();
    List<Message> messageList = new ArrayList<>();

    public Set<User> getUserChatSet() {
        return userChatSet;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void addUser(User user){
        userChatSet.add(user);
    }

    public void addMessage(Message mess) {
        messageList.add(mess);
    }

    public void addMessage(Message[] messageList) {
    }

    public void addMessage(List<Message> messageList) {
    }

    public void save(Chat chat){
        SaverChat saverChat = new SaverChat();
        saverChat.save(chat);
    }
}





