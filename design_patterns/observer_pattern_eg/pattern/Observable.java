package observer.pattern;

public interface Observable<T> {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyAllObservers();

    T getState();

    void setState(T state);
}
