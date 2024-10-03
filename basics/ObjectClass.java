/*
 * Every class in Java extends Object Class
*/

import netscape.javascript.JSObject;

class Laptop {
    String model;
    int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Model-" + model + "\nPrice-" + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        Laptop other = (Laptop) obj;
        return this.model.equals(other.model) && this.price == other.price;
    }

}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop("DELL", 2500000);

        // //Before adding toString Method
        // System.out.println(obj); //Laptop@7ad041f3 Classname@hashcode
        // //by default the above line calls toStringMethod

        // After adding
        System.out.println(obj);

        // Before adding equlas method
        Laptop obj2 = new Laptop("DELL", 2500000);
        // System.out.println(obj.equals(obj2));// false

        // After adding
        System.out.println(obj.equals(obj2)); // true
    }
}
