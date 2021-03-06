/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 *
 * @author ramsey.kerley
 */
public class Syrup implements Orderable {

    String flavor;
    Money price;

    public Syrup(String flavor, Money price) {

        this.flavor = flavor;
        this.price = price;
    }

    /**
     * gets price
     *
     * @return price as money
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
        return flavor + " $" + this.getPrice().getAmountString() + "\n";

    }
    
    /**
     * give the flavor name
     * @return flavor
     */
    @Override
    public String toString() {
        return flavor;
    }

}
