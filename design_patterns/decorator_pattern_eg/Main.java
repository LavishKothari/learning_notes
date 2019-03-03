package beverage;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage soyEspresso = new SoyDecorator(espresso);
        Beverage caramelSoyEspresso = new CaramelDecorator(soyEspresso);
        // creating objects dynamically at runtime and avoid class explosion.

        System.out.println(caramelSoyEspresso.getCost());
    }
}
