package Observer_Design_Pattern.Observable;

import java.util.*;

import Observer_Design_Pattern.Observer.NotificationAlertObserver;

//Create the implementation of observable interface
public class iPhoneObservable implements StockObservable {
    int stockCount = 0;
    List<NotificationAlertObserver> observerList = new ArrayList<>();

    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    public void sendNotification() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    public void setData(int stockCount) {
        if (this.stockCount == 0) {
            sendNotification();
        }

        this.stockCount += stockCount;
    }

    public int getData() {
        return this.stockCount;
    }
}
