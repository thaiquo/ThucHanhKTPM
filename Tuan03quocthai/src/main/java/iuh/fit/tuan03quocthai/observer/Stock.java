package iuh.fit.tuan03quocthai.observer;



public class Stock extends Subject {
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers("Stock price changed: " + price);
    }
}
