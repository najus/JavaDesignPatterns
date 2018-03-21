package observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    GetTheStock(Subject stockGrabber, int startTime, String newStock, double
            newPrice) {
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            double randNum = (Math.random() * 0.06) - 0.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format((price + randNum)));

            if (stock.equals("IBM")) ((StockGrabber) stockGrabber).setIbmPrice(price);
            if (stock.equals("AAPL")) ((StockGrabber) stockGrabber).setApplPrice(price);
            if (stock.equals("GOOG")) ((StockGrabber) stockGrabber).setGoogPrice(price);

            System.out.println(stock + " :" + df.format((price + randNum))
                    + "  " + df.format(randNum));
        }
    }
}
