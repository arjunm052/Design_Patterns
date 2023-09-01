package Observer_Design_Pattern.Observer;

import Observer_Design_Pattern.Observable.StockObservable;

public class EmailNotificationImplementation implements NotificationAlertObserver {

    String email;
    StockObservable observable;

    public EmailNotificationImplementation(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(this.email, "The product is back in stock!");
    }

    public void sendMail(String email, String message) {
        System.out.println("Message sent to " + email);
        // Logic to send message
    }

}
