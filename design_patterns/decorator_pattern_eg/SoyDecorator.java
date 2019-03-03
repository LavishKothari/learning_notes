package beverage;

public class SoyDecorator extends AddonDecorator {
    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        // ...
        return 0.8 + this.beverage.getCost();
    }
}