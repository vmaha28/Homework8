package fastrack.com.tema.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.add("Apple");
        basket1.add("Banana");
        basket1.add("Blueberry");
        basket1.add("Strawberry");
        basket1.add("Banana");
        basket1.add("Orange");
        System.out.println(basket1.find("Apple"));
        System.out.println(basket1.remove("Orange"));
        System.out.println(basket1.position("Banana"));
        System.out.println(basket1.fruitList);
        System.out.println(basket1.count());
        System.out.println(basket1.coustumCount());



    }
}
