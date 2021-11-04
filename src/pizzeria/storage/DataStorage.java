package pizzeria.storage;

import pizzeria.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {


    private Customer customer;
    private Orders order;
    private Pizza pizza;
    List<Orders> orders=new ArrayList<>();
    List<Pizza> pizzas=new ArrayList<>();
    List<Ingredients> ingredientsList=new ArrayList<>();



    public void addPizzaIngredients(Ingredients ingredients){

        if (this.ingredientsList.size()+1<=7){
            this.ingredientsList.contains(ingredients);
        }else if (this.ingredientsList.size()+1<7) {
            System.out.println("Pizza is full");
        }else if(this.ingredientsList.contains(ingredients)){
            System.out.println("Check the order again");
        }
    }
    public List<Ingredients> pizzaMargarita(){
        List<Ingredients> margaritaIng=new ArrayList<>();
        PizzaType pizzaType=PizzaType.REGULAR;
        margaritaIng.add(Ingredients.TOMATO_PASTE);
        margaritaIng.add(Ingredients.PEPPER);
        margaritaIng.add(Ingredients.GARLIC);
        margaritaIng.add(Ingredients.BACON);
        return margaritaIng;
    }
    public List<Ingredients> pizzaWithSalami(){
        List<Ingredients> salamiIng=new ArrayList<>();
        salamiIng.add(Ingredients.TOMATO_PASTE);
        salamiIng.add(Ingredients.CHEESE);
        salamiIng.add(Ingredients.SALAMI);
        salamiIng.add(Ingredients.OLIVES);
        return salamiIng;
    }
    public List<Ingredients> pizzaPepperoniOro(){
        List<Ingredients> pepperoniIng=new ArrayList<>();
        pepperoniIng.add(Ingredients.TOMATO_PASTE);
        pepperoniIng.add(Ingredients.CHEESE);
        pepperoniIng.add(Ingredients.SALAMI);
        pepperoniIng.add(Ingredients.OLIVES);
        return pepperoniIng;

    }
    public void printIngredients(){
        Ingredients[] values = Ingredients.values();
        for (Ingredients ingredients:values) {
            System.out.println(ingredients);
        }
    }
    public  void printOrder(){
        System.out.print("[Order: "+order.getNumber());
        System.out.print(": Customer: "+customer.getNumber());
        System.out.print(": PizzaName: "+pizza.getName());
        System.out.print(": Quantity: "+pizza.getQuantity()+"]");
    }

public void printCheck(){
    double amount=0;
    double totalAmount=0;
        System.out.println("Order: " + order.getNumber());
        System.out.println("Client: " + customer.getNumber());
        System.out.println("Name: " + pizza.getName());
        System.out.println("***************************");
    for (Pizza pizzaList: pizzas) {

        System.out.println("Pizza Base: ("+pizza.getPizzaType().toString()+")  "+pizza.getPizzaType().getPrice()+"$");
        List<Ingredients>ingredients=pizzaList.getIngredientsList();
        for (Ingredients ingredients1: ingredients) {
            System.out.println(ingredients1.toString()+"  "+ingredients1.getPrice());
            amount+=ingredients1.getPrice();
        }
        System.out.println("-----------------------");
        System.out.println("Amount: "+amount+"$");
        System.out.println("Quantity: "+pizza.getQuantity());
        totalAmount+=amount*pizza.getQuantity();
    }

        System.out.println("---------------------------------");

        System.out.println("Total Amount: " + totalAmount+"$");
        System.out.println("***************************");
}

}
