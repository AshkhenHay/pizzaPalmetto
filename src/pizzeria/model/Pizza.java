package pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private List<Ingredients> ingredientsList=new ArrayList<>();
    private int quantity=1;
    private PizzaType pizzaType;



    public Pizza(String name,  int quantity, PizzaType pizzaType) {

        this.name = name;
        this.quantity = quantity;
        this.pizzaType = pizzaType;

    }

    public Pizza() {
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredients> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }



    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredient=" + ingredientsList +
                ", quantity=" + quantity +
                ", pizzaType=" + pizzaType +
                '}';
    }
}


