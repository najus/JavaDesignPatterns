package observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerId;
    private Subject stockGrabber;

    StockObserver(StockGrabber stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIDTracker;
        System.out.println("New observer " + this.observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.aaplPrice = aaplPrice;
        this.ibmPrice = ibmPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerId + "\nIbm price: " + ibmPrice
                + "\nApple price: " + aaplPrice + "\nGooglePrice: " + googPrice);
    }
}
