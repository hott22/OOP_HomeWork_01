public class Product {
    protected int expirationDate;
    private String name;
    private int price;
    private int count;
    private String unitMeasurement;


    public Product(String name, int price,int count, String unitMeasurement ){
        this.name = name;
        this. price = price;
        this.count = count;
        this.unitMeasurement = unitMeasurement;
    }

    @Override
    public String toString() {
        return String.format("name: %s , price: %d , count: %d , unitMeasurement: %s",
                this.name, this.price, this.count, this.unitMeasurement);
    }
}
