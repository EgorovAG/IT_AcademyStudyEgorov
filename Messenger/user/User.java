package user;

import registrationValidation.Registration;
import registrationValidation.MyException;
import registrationValidation.Validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String password;

    public static Map<String, Integer> userMap = new HashMap<>();
    public static void addUserMap(String name, int id){
        userMap.put(name, id);
    }

    public User(String name, String password) throws MyException {
        this.name = name;
        this.password = password;
        Validation.validName(name);
        Validation.validPassword(password);
        Registration.reg(name,password);

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
}
