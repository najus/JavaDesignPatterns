package abstractfactory;

/**
 * Created by najus on 3/13/18.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
