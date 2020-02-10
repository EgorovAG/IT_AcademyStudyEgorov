package registrationValidation;

import user.User;

import java.util.Random;

public class Registration {


    public static User createUser(String name, String password) throws MyException {
        Validation.validationNameAndPassword(name,  password);

        return Registration.reg(name, password);

    }

    public static User reg(String name, String password) throws MyException {
        int id;
        if (!User.userMap.containsKey(name)) {
            do {
                Random random = new Random();
                id = random.nextInt(5000);
            }
            while(User.userMap.containsValue(id));
            User.addUserMap(name, id);
            }
         else
            {
            throw new MyException("Пользователь с таким именем уже существует");
        }

        return new User (id, name, password);
    }
}



