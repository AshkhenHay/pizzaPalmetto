package pizzeria.model;

public class Customer {
    private String name;
    private int number;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
        this.number = addCustomerNumber();
    }
    public int addCustomerNumber(){
        if ( number<=9999){
            return number++;
        }else{
            return number=1000;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (getNumber() != customer.getNumber()) return false;
        return getName() != null ? getName().equals(customer.getName()) : customer.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getNumber();
        return result;
    }
}
