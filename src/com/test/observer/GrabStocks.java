package com.test.observer;

public class GrabStocks {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        stockGrabber.setApplPrice(100.0);

        Runnable getIbm = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAaple = new GetTheStock(stockGrabber, 2, "IBM", 667.00);
        Runnable getGoog = new GetTheStock(stockGrabber, 2, "IBM", 676.00);

        new Thread(getIbm).start();
        new Thread(getAaple).start();
        new Thread(getGoog).start();


    }
}
