package Observer_Design_Pattern;

import Observer_Design_Pattern.Observable.StockObservable;
import Observer_Design_Pattern.Observable.iPhoneObservable;
import Observer_Design_Pattern.Observer.EmailNotificationImplementation;
import Observer_Design_Pattern.Observer.NotificationAlertObserver;
import Observer_Design_Pattern.Observer.PhoneNotificationImplementation;

public class design {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new iPhoneObservable();

        NotificationAlertObserver observer1 = new EmailNotificationImplementation("singh.arjun127@gmail.com",
                iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotificationImplementation("xyz1@gmail.com",
                iphoneStockObservable);
        NotificationAlertObserver observer3 = new PhoneNotificationImplementation("1234567890", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setData(10);

    }
}