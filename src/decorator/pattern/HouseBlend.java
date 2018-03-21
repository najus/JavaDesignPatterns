package decorator.pattern;

/**
 * Created by najus on 2/8/18.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
