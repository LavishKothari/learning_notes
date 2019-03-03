package beverage;

public abstract class AddonDecorator implements Beverage {
    Beverage beverage; // has-a
    // this is wrapping beverage and is agnostic of what specific beverage
}
