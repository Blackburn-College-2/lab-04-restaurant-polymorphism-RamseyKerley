/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import edu.blackburn.cs.cs212.restaurantbase.*;
import java.util.ArrayList;

/**
 *
 * @author ramsey.kerley
 */
public class FancyCoffee extends Coffee {

    ArrayList<Orderable> addOn = new ArrayList<>();

    FancyCoffee(String name, Money basePrice, Size size) {
        super(name, basePrice, size);

    }

    /**
     * this adds a extra piece to the coffee
     *
     * @param o
     */
    public void add(Orderable o) {
        addOn.add(o);
    }
    
    /**
     * gives the coffee and what is added
     * @return string
     */
    @Override
    public String toString() {
        String syrup = addOn.toArray()[0].toString();
        return super.toString() + "\n" + syrup;
    }

}
