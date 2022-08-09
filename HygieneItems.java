public class HygieneItems extends Product {
    private int numberPieces;


    public HygieneItems(String name, int price, int count, String unitMeasurement, int numberPieces) {
        super(name, price, count, unitMeasurement);
        this.numberPieces = numberPieces;
    }

    @Override
    public String toString() {
        return super.toString() + " , numberPieces: " + this.numberPieces;
    }
}
