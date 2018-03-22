package abstractfactory;

/**
 * Created by najus on 3/13/18.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
