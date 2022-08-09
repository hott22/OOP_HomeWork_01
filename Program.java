import java.util.ArrayList;
import java.util.List;

public class Program {
    public static <product> void main(String[] args) {
        //Product prod = new Product("Мед", 1500, 3, "liter");
        //FooProducts fooProducts = new FooProducts("Apple", 50,10,"kilogram", "10.11.2022");
        //Drinks water = new Drinks("Akwa", 10, 2, 4);
        Milk milk = new Milk("Vila", 10, 5, 2, 10, "10.10.2022");
        Lemonade lemonade = new Lemonade("Lemon", 34,3,1);
        Bread bread = new Bread("Selo", 12,"count", "12.12.1232", "wheat");
        Eggs eggs = new Eggs("Chicken", 23,2,"count", "10.10.2345",10);
        Masks masks = new Masks("Mass", 34,10,"count", 100);
        ToiletPaper paper = new ToiletPaper("Toilet", 345,56, 8,100);
        Diapers diapers = new Diapers("Huggis", 100,20, 50,5,10,15,"large");


        List <Product> products = new ArrayList<>();
        products.add(milk);
        products.add(lemonade);
        products.add(bread);
        products.add(eggs);
        products.add(masks);
        products.add(paper);
        products.add(diapers);

        for (Product i :
                products) {
            System.out.println(i);

        }


    }
}
