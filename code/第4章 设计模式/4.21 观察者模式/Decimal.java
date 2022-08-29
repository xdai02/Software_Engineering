import java.util.ArrayList;
import java.util.List;

public class Decimal {
    private List<Observer> observers = new ArrayList<>();
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        updateAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void updateAllObservers(){
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
