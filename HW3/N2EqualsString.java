//Оператор == проверяет ссылки, а не значения. Это означает, что он проверяет,
// являются ли сравниваемые элементы одним и тем же объектом. Если две переменные
// String указывают на один и тот же объект в памяти, сравнение возвращает true.
// В противном случае — false


public class N2EqualsString {
    public static void main(String[] args) {
        String str1="Мама мыла раму";
        String str2= "Мама"+" мыла "+"раму";
        System.out.println(str1==str2);

//        System.out.println("Мама мыла раму"=="Мама"+" мыла "+"раму");
//       При создании экземпляра класса String путем
//       присваивания его ссылки на литерал, последний помещается в так называемый «пул литералов». Если
//       в дальнейшем будет создана еще одна ссылка на литерал, эквивалентный ранее
//       объявленному, то будет произведена попытка добавления его в «пул литера-
//       лов». Так как идентичный литерал там уже существует, то дубликат не может
//       быть размещен, и вторая ссылка будет на существующий литерал. Аналогично
//       в случае, если литерал является вычисляемым.
//        Конкретно в нашем случае в "пуле литералов" появятся следующие литералы:
//        "Мама мыла раму"; "Мама"; "Мама мыла", т.е. 2 наши ссылки на один литерал "Мама мыла раму".
    }
}
