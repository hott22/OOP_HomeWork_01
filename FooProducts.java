public class FooProducts extends Product{
    private String expirationDate;


    public FooProducts(String name, int price, int count, String unitMeasurement, String expirationDate) {
        super(name, price, count, unitMeasurement);
        this.expirationDate = expirationDate;
    }


    @Override
    public String toString() {
        return super.toString() + " , expirationDate: " + this.expirationDate;
    }
}
