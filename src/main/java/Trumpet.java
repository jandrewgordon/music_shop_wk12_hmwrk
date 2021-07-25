public class Trumpet extends Instrument implements IPlay {


    public Trumpet(String make, String material, String colour, double buyPrice, double sellPrice) {
        super(make, material, colour, buyPrice, sellPrice);
    }


    @Override
    public String play() {
        return "Bwaaa!";
    }
}
