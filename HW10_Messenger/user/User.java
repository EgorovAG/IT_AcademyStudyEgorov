package user;

//3. Для сереализации класса пользователя определить методы описанные
// в документации к интерфейсу Serializable (writeObject, readObject, readObjectNoData)

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User implements Serializable {
    private static final long serialVersionUID = -5261317851611445490L;
    private int id;
    private String name;
    private String password;

    public static Map<String, Integer> userMap = new HashMap<>();
    public static void addUserMap(String name, int id){
        userMap.put(name, id);
    }

    public User(int id, String name, String password) {
        this.id =id;
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.defaultWriteObject();


    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();

    }

    private void readObjectNoData()
            throws ObjectStreamException {

    }
}
