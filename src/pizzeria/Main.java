package pizzeria;

import pizzeria.model.*;
import pizzeria.storage.DataStorage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pizzeria.model.Ingredients.TOMATO_PASTE;

public class Main implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static DataStorage dataStorage;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_ORDER:
                    addOrder();
                    break;
                case ADD_PIZZA:
                    addPizza();
                    break;

                case PRINT_CHECK:
                    dataStorage.printCheck();
                    break;
                case PRINT_ORDER:
                    dataStorage.printOrder();
                    break;
                default:
                    System.out.println("Wrong command!");
            }

        }
    }


    public static Customer addCustomer() {
        System.out.println("Please input customer name");
        String name = scanner.nextLine();
        Customer customer = new Customer();
        customer.setName(name);
        return customer;
    }

    public static Pizza addPizza() {
        Pizza pizza = new Pizza();

        System.out.println("Please input Pizza type Regular or CALZONE , Quantity");
        String command = scanner.nextLine();
        String[] split = command.split(",");
        String s = split[0].toUpperCase();
        if (s.equals(PizzaType.REGULAR)) {
            pizza.setPizzaType(PizzaType.valueOf(s));

        } else if (s.equals(PizzaType.CALZONE)) {
            pizza.setPizzaType(PizzaType.valueOf(s));
        }
        pizza.setQuantity(Integer.parseInt(split[1]));
        System.out.println("Please input pizza name or input choose our(Margarita,PepperoniOro, Salami)");
        command=scanner.nextLine();
        String s1 = command.toUpperCase();
        if (s1.equals("MARGARITA")) {
            List<Ingredients> ingredients = dataStorage.pizzaMargarita();
            for (Ingredients ingredient :
                    ingredients) {
                System.out.println(ingredient);
            }

        } else if (s1.equals("PEPPERONI")) {
            List<Ingredients> ingredients = dataStorage.pizzaPepperoniOro();
            for (Ingredients ingredient :
                    ingredients) {
                System.out.println(ingredient);
            }
        } else if (s1.equals("SALAMI")){
            List<Ingredients> ingredients = dataStorage.pizzaWithSalami();
            for (Ingredients ingredient :
                    ingredients) {
                System.out.println(ingredient);
            }
        } else {
            pizza.setName(command);
            addIngredients();

        }
        return pizza;
    }

    public static void addIngredients() {

        System.out.println("Please input ingredients Tomato Paste,Cheese,Salami,Bacon,Garlic,Corn,Pepperoni,Olives,Pepper");
        String command = scanner.nextLine();
        String commandIngr = command.toUpperCase();
        switch (commandIngr) {

            case "TOMATO_PASTE":
                dataStorage.addPizzaIngredients(TOMATO_PASTE);
                break;
            case "CHEESE":
                dataStorage.addPizzaIngredients(Ingredients.CHEESE);
                break;
            case "SALAMI":
                dataStorage.addPizzaIngredients(Ingredients.SALAMI);
                break;
            case "BACON":
                dataStorage.addPizzaIngredients(Ingredients.BACON);
                break;
            case "GARLIC":
                dataStorage.addPizzaIngredients(Ingredients.GARLIC);
                break;
            case "CORN":
                dataStorage.addPizzaIngredients(Ingredients.CORN);
                break;
            case "PEPPERONI":
                dataStorage.addPizzaIngredients(Ingredients.PEPPERONI);
                break;
            case "OLIVES":
                dataStorage.addPizzaIngredients(Ingredients.OLIVES);
                break;
            case "PEPPER":
                dataStorage.addPizzaIngredients(Ingredients.PEPPER);
                break;
            default:
                System.out.println("Wrong command");
                break;
        }
    }

    public static void addOrder() {
        Orders order = new Orders();
        Customer customer = addCustomer();
        Pizza pizza = addPizza();
        order.setCustomer(customer);
        order.setPizza(pizza);
        order.setTime(LocalTime.now());


    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_ORDER + " for ADD_ORDER");
        System.out.println("Please input " + ADD_PIZZA + " for ADD_PIZZA");
        System.out.println("Please input " + PRINT_CHECK + " for PRINT_CHECK");
        System.out.println("Please input " + PRINT_ORDER + " for PRINT_ORDER");

    }

}







