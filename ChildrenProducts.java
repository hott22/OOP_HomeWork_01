public class ChildrenProducts extends Product{
    private int minimumAge;
    private boolean hypoallergenic;


    public ChildrenProducts(String name, int price, int count, String unitMeasurement, int minimumAge, boolean hypoallergenic) {
        super(name, price, count, unitMeasurement);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() + " , minimumAge: " + this.minimumAge + " , hypoallergenic: " + this.hypoallergenic;
    }
}
