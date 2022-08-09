public class Eggs extends FooProducts{
    private int quantityPackage;

    public Eggs(String name, int price, int count, String unitMeasurement, String expirationDate, int quantityPackage) {
        super(name, price, count, unitMeasurement, expirationDate);
        this.quantityPackage = quantityPackage;
    }

    @Override
    public String toString() {
        return super.toString() + " , quantityPackage: " + this.quantityPackage;
    }
}
