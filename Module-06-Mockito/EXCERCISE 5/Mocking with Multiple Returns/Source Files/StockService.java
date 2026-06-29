public class StockService {
    private StockApi stockApi;

    public StockService(StockApi stockApi) {
        this.stockApi = stockApi;
    }

    public double getPrice(String symbol) {
        return stockApi.fetchPrice(symbol);
    }
}
