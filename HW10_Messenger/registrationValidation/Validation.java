package registrationValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validationNameAndPassword(String name, String password) throws MyException {

            Pattern pattern1 = Pattern.compile("\\w+@\\w+.[a-z]{2,5}");
            Matcher matcher1 = pattern1.matcher(name);
            if (matcher1.matches()) {
            } else {
                throw new MyException("Имя не соответствует типу e-mail");
            }


            //1. Пароль должен быть не короче 7 символов
            //2. Там обязательно должен быть как минимум один из символов ':/!?+%
            //3.* там не должно быть двух рядом стоящих одинаковых символов
            for (int i = 0; i < password.length() - 1; i++) {
                if (password.charAt(i) ==password.charAt(i + 1)) {
                    throw new MyException("В пароле повторяются 2 рядом стоящих символа");
                }
            }

            Pattern pattern2 = Pattern.compile("(?=.{7,})[':/!?+%]*\\w*[':/!?+%]+\\w*[':/!?+%]*");
            Matcher matcher2 = pattern2.matcher(password);
            if (matcher2.matches()) {
            } else {
                throw new MyException("Пароль не соответствует стандартам пароля");
            }
            return true;
        }
    }

