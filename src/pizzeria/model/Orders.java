package pizzeria.model;

import java.time.LocalTime;

public class Orders  {
    private int number;
    private Customer  customer;
    private Pizza pizza;
    private LocalTime time;


    public Orders(  Customer customer, Pizza pizza, LocalTime time) {

        this.number = addOrderNumber();
        this.customer = customer;
        this.pizza = pizza;
        this.time = time;

    }

    public Orders() {
    }

    public int addOrderNumber(){
        if ( number<=99999){
            return number++;
        }else{
            return number=10000;
        }
    }

    @Override
    public String toString() {
        return "Orders{" +
                "number=" + number +
                ", customer=" + customer +
                ", pizza=" + pizza +
                ", time=" + time +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

}
