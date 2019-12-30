package garage.parts.api;

public interface ILock {
    void openLock(String key);
    void closeLock(String key);
}
