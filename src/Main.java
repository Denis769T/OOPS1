import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product item1 = new Product(100.0, 1, "Чипсы Lays");
        Product item2 = new Product(80.0, 2, "Батончик NUTS");
        Product item3 = new Product(40.0, 3, "Сухарики");
        Product item4 = new Bottle(14.5, 4, "Cola", 0.5f);
        Product item5 = new Bottle(20.5, 5, "Mineral", 0.5f);
        Product item6 = new HotDrink(89.9, 6, "Кофе", 0.3f, 50);
        Product item7 = new HotDrink(80.7, 7, "Чай", 0.25f, 60);

        List<Product> products = new ArrayList<>();
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        products.add(item5);
        products.add(item6);
        products.add(item7);

        System.out.println(products);

    }
}