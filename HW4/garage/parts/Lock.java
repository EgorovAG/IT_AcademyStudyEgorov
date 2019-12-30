package garage.parts;

import garage.parts.api.IKey;
import garage.parts.api.ILock;

public class Lock implements ILock {

    private String lock = "key_578" ;

    @Override
    public void openLock(String key) {
        if(this.lock==key) System.out.println("Замок открыт");

    }

    @Override
    public void closeLock(String key) {

    }
}
