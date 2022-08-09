public class Milk extends Drinks {
    private int percentageFatContent;
    private String expirationDate;

    public Milk(String name, int price, int count, int volume, int percentageFatContent, String expirationDate) {
        super(name, price, count, volume);
        this.percentageFatContent = percentageFatContent;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + " , percentageFatContent: " + this.percentageFatContent +
                " , expirationDate: " + this.expirationDate;
    }
}
