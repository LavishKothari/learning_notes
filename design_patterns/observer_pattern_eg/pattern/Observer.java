package observer.pattern;

public interface Observer {
    <T> void update(Observable<T> observable);
}
