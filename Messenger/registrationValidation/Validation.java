package registrationValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validName(String name) throws MyException {
        Pattern pattern = Pattern.compile("\\w+@\\w+.[a-z]{2,5}");
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
        }
        else { throw new MyException("Имя не соответствует типу e-mail");
        }
        return true;
    }

    public static boolean validPassword(String password) throws MyException {
        //1. Пароль должен быть не короче 7 символов
        //2. Там обязательно должен быть как минимум один из символов ':/!?+%
        //3.* там не должно быть двух рядом стоящих одинаковых символов
         for (int i = 0; i <password.length()-1 ; i++) {
             if(password.charAt(i)==password.charAt(i+1)){
                 throw new MyException("Повторяются 2 рядом стоящих символа");
            }
        }

        Pattern pattern = Pattern.compile("([a-zA-Z0-9':/!?+%]+){7,}"); //regex неверный- исправитЬ!!!
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
        }
        else { throw new MyException("Имя не соответствует стандартам пароля");
        }
        return true;
    }
}
