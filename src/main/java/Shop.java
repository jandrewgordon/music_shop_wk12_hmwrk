import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name) {
        this.stock = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        stock.remove(item);
    }

    public double totalProfit(){
        double total = 0.0;
        for(ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
