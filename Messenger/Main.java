import chat.Chat;
import message.Message;
import message.api.Type;
import registrationValidation.MyException;
import user.User;

import java.util.Date;


public class Main {
    public static void main(String[] args) throws MyException {

        User user1 = new User("alex@mail.ru","qwerty!");
        User user2 = new User("Nikola@mail.ru","asdfgh?");
        System.out.println(user1);
        System.out.println(user2);
//        System.out.println(User.userMap); //проверка вывода ID

        Chat chat = new Chat();
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addMessage(new Message(user1, Type.Text, "Hello", new Date()));
        chat.addMessage(new Message(user2,Type.Text, "Hi, my friend!", new Date()));
        chat.addMessage(new Message(user1, Type.Text, "How are you?", new Date()));
        chat.addMessage(new Message(user2,Type.Text, "I'am fine! Thanks", new Date()));
        chat.save(chat);

    }
}
