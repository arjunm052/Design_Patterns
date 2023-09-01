package Observer_Design_Pattern.Observable;

import Observer_Design_Pattern.Observer.NotificationAlertObserver;

//Create the observable interface
public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void sendNotification();

    public void setData(int stockCount);

    public int getData();

}
