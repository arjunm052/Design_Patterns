package Observer_Design_Pattern.Observer;

import Observer_Design_Pattern.Observable.StockObservable;

//Create implementation of Observer
public class PhoneNotificationImplementation implements NotificationAlertObserver {

    String mobileNo;
    StockObservable observable;

    public PhoneNotificationImplementation(String mobileNo, StockObservable observable) {
        this.mobileNo = mobileNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessage(mobileNo, "The product is back in stock!");
    }

    public void sendMessage(String mobileNo, String message) {
        System.out.println("Message sent on " + mobileNo);
        // Logic to send message
    }

}
