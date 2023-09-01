package Observer_Design_Pattern;

import Observer_Design_Pattern.Observable.StockObservable;
import Observer_Design_Pattern.Observable.iPhoneObservable;
import Observer_Design_Pattern.Observer.EmailNotificationImplementation;
import Observer_Design_Pattern.Observer.NotificationAlertObserver;
import Observer_Design_Pattern.Observer.PhoneNotificationImplementation;

public class design {
    public static void main(String[] args) {
        // Create an object of observable
        StockObservable iphoneStockObservable = new iPhoneObservable();

        // Create observers and pass the reference to observable
        NotificationAlertObserver observer1 = new EmailNotificationImplementation("singh.arjun127@gmail.com",
                iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotificationImplementation("xyz1@gmail.com",
                iphoneStockObservable);
        NotificationAlertObserver observer3 = new PhoneNotificationImplementation("1234567890", iphoneStockObservable);

        // Add the observers to the observers list
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        // Update Stock
        iphoneStockObservable.setData(10);

    }
}