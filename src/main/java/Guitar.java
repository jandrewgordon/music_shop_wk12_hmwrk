public class Guitar extends Instrument implements IPlay {

    private GuitarType type;
    private String model;

    public Guitar(String make, String material, String colour, double buyPrice, double sellPrice, GuitarType type, String model) {
        super(make, material, colour, buyPrice, sellPrice);
        this.type = type;
        this.model = model;
    }

    @Override
    public String play() {
        return "Twang";
    }
}
