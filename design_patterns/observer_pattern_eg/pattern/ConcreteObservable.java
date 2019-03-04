package observer.pattern;

import java.util.HashSet;
import java.util.Set;

public class ConcreteObservable<T> implements Observable<T> {

    private Set<Observer> observers = new HashSet<>();

    private T state; // we need to observe the state of this object

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.stream()
                .forEach(observer -> observer.update(this));
    }

    @Override
    public T getState() {
        return state;
    }

    @Override
    public void setState(T newState) {
        this.state = newState;
        notifyAllObservers();
    }
}
