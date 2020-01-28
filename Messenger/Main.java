import Saver.SaverChat;
import chat.Chat;
import message.Message;
import message.api.Type;
import registrationValidation.MyException;
import registrationValidation.Registration;
import user.User;

import java.util.Date;


public class Main {
    public static void main(String[] args) throws MyException {


        User user2 = Registration.createUser("Nikola@mail.ru","asdfgh?");
        User user1 = Registration.createUser("alex@mail.ru","qwerty!");

//        System.out.println(user1);
//        System.out.println(user2);

        Chat chat = new Chat(user1,user2);

        chat.addMessage(new Message(user1, Type.Text, "Hello", new Date()));
        chat.addMessage(new Message(user2,Type.Text, "Hi, my friend!", new Date()));
        chat.addMessage(new Message(user1, Type.Text, "How are you?", new Date()));
        chat.addMessage(new Message(user2,Type.Text, "I'am fine! Thanks", new Date()));

        SaverChat saverChat = new SaverChat();
        saverChat.saveFileChat(chat);

        }
    }

