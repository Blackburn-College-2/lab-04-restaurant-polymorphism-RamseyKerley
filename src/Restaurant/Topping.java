/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/**
 *
 * @author ramsey.kerley
 */
public class Topping implements Orderable {

    String type;
    Money price;

    public Topping(String type, Money price) {

        this.type = type;
        this.price = price;
    }

    /**
     * this gets the price
     *
     * @return money
     */
    @Override
    public Money getPrice() {
        return this.price;
    }

    /**
     * this is what is printed when receipt.prepare gives
     *
     * @return string
     */
    @Override
    public String getReceiptItem() {
        return type + " $" + this.price.getAmountString() + "\n";
    }
    
    /**
     * gives the type of topping
     * @return type
     */
    @Override
    public String toString() {
        return type;
    }

}
