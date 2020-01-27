package message;

import message.api.Type;
import user.User;

import java.util.Date;

public class Message<T> {
    User user;
    Type type;
    T data;
    Date date;

    public Message(User user, Type type, T data, Date date) {
        this.user = user;
        this.type = type;
        this.data = data;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", type=" + type +
                ", data=" + data +
                ", date=" + date +
                '}';
    }
}
