package chat;

import message.Message;
import registrationValidation.MyException;
import user.User;

import java.util.*;

public class Chat {
    Set<User> userChatSet = new HashSet<>();
    List<Message> messageList = new ArrayList<>();

    public Chat(User...users) throws MyException {
        if (users.length > 1)   {
            for (int i = 0; i < users.length; i++) {
                userChatSet.add(users[i]);
            }
        } else
                {throw new MyException("В чате не может быть меньше 2 пользователей");
            }
        }

    public Chat(Set<User> userChatSet1) throws MyException {
        if (userChatSet1.size() > 1)   {
                userChatSet.addAll(userChatSet1);
        } else
                {throw new MyException("В чате не может быть меньше 2 пользователей");
                }
    }


    public Set<User> getUserChatSet() {
        return userChatSet;
    }

    public void setUserChatSet(Set<User> userChatSet) {
        this.userChatSet = userChatSet;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void addMessage(Message mess) {
        this.messageList.add(mess);
    }

    public void addMessage(Message[] messageList) {
        if (messageList != null) {
            for (Message mes : messageList) {
                this.addMessage(mes);
            }
        }
    }

    public void addMessage(List<Message> messageList) {
            if(messageList!=null){
                for (Message mes: messageList) {
                    this.addMessage(mes);
                }
            }
        }
}





