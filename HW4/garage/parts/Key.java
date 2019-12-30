package garage.parts;

import garage.parts.api.IKey;

public class Key implements IKey {
    private String key = "123";


    @Override
    public void keyFits(String key) {
//        if (this.key == key)
//            System.out.println("Ключ подходит к замку");
//        else
//            System.out.println("Ключ не подходит к замку");
    }


}
