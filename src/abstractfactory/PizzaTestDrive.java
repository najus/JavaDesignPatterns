package abstractfactory;

/**
 * Created by najus on 3/13/18.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");
    }
}
