package garage.parts.lock.api;

import garage.parts.key.api.IKey;

public interface ILock {
    boolean close(IKey key);
    boolean open(IKey key);

}
