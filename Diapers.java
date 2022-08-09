public class Diapers extends HygieneItems{
    private int size;
    private int minimumWeight;
    private int maximumWeight;
    private String type;


    public Diapers(String name, int price, int count, int numberPieces,
                   int size, int minimumWeight, int maximumWeight, String type) {
        super(name, price, count, "count", numberPieces);
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " , size: " + this.size + " , minimumWeight: "
                + this.minimumWeight + " , maximumWeight: " + this.maximumWeight + " , type: " + this.type;
    }
}
