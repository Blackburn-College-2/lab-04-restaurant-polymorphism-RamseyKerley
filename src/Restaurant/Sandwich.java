/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/**
 *
 * @author ramsey.kerley
 */
public class Sandwich implements Orderable {

    ArrayList<Orderable> contents;
    Money price;

    public Sandwich(Money basePrice) {
        this.price = basePrice;
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
        return "Sandwich $" + this.price.getAmountString() + "\n";
    }
    
    /**
     * this returns the word sandwich
     * @return string 
     */
    @Override
    public String toString() {
        return "Sandwich";
    }

}
