package garage.parts.lock;

import garage.parts.key.api.IKey;
import garage.parts.lock.api.ILock;

public class Lock implements ILock {
    private final String numberOfKey;

    public Lock(String numberOfKey) {
        this.numberOfKey = numberOfKey;
    }

    @Override
    public boolean close(IKey key) {
        return key.getKey().equals(numberOfKey);
    }

    @Override
    public boolean open(IKey key) {
        return key.getKey().equals(numberOfKey);
    }
}
