import java.util.ArrayList;

public class StockMarket implements Stock {

    ArrayList<Observer> list = new ArrayList<>();

    private String stockName;
    private double price;

    public void register(Observer o) {
        list.add(o);
    }

    public void deregister(Observer o) {
        list.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : list) {
            o.update(stockName, price);
        }
    }

    public void setStock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        notifyObservers();
    }

}