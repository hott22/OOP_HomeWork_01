public class Drinks extends Product{
    private int volume;

    public Drinks(String name, int price, int count, int volume) {
        super(name, price, count, "litre");
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " , volume: " + this.volume;
    }
}
