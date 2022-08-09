public class ToiletPaper extends HygieneItems{
private int numberLayers;

    public ToiletPaper(String name, int price, int count, int numberPieces, int numberLayers) {
        super(name, price, count, "unlimited", numberPieces);
        this.numberLayers = numberLayers;
    }

    @Override
    public String toString() {
        return super.toString() + " , numberLayers: " + this.numberLayers;
    }
}
