package decorator.pattern;

/**
 * Created by najus on 2/8/18.
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
