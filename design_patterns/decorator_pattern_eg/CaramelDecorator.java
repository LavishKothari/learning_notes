package beverage;

public class CaramelDecorator extends AddonDecorator {
    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double getCost() {
        // ...
        return 0.5 + this.beverage.getCost();
    }
}
