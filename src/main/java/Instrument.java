public class Instrument implements ISell {

    private String make;
    private String material;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String make, String material, String colour, double buyPrice, double sellPrice) {
        this.make = make;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
