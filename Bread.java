public class Bread extends  FooProducts{
    private String typeFlour;

    public Bread(String name, int price, String unitMeasurement, String expirationDate, String typeFlour) {
        super(name, price, 1, unitMeasurement, expirationDate);
        this.typeFlour = typeFlour;

    }

    @Override
    public String toString() {
        return super.toString() + " , typeFlour: " + this.typeFlour;
    }
}
