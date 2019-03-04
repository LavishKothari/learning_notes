package observer.pattern;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcreteObserver implements Observer {

    private static final AtomicInteger idGenerator = new AtomicInteger();
    private final int id;

    public ConcreteObserver() {
        this.id = idGenerator.incrementAndGet();
    }

    @Override
    public <T> void update(Observable<T> observable) {
        // here you can use observable to get the state that has changed.
        System.out.println("observer " + id + " is updated.");
    }
}
