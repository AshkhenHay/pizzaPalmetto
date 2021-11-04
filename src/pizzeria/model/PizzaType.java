package pizzeria.model;

public enum PizzaType {
    REGULAR(1), CALZONE(1.5);
    double price;

    PizzaType(double price) {
        this.price = price;
    }

    PizzaType() {
    }

    public double getPrice() {
        return price;
    }
}
