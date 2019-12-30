package countries;

public class Test {
    public static void main(String[] args) {
        Country country = Country.valueOf("GERMANY");
        Country country1 = Country.GERMANY;
        System.out.println(country==country1);

       try {
           Country country2 = Country.valueOf("BRASIL");
           System.out.println(country2);
       }
       catch (Exception e) {
           System.out.println("Такого элемента нет");
       }

        Country country2 = Country.AUSTRIA;
       country2.compare(Country.BELGIUM);
    }
}
