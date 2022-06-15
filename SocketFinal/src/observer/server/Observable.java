package observer.server;

import java.io.IOException;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message) throws IOException;

}
