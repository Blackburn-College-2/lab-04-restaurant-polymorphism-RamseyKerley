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
public class Coffee extends MenuItem {

    Size size;

    public Coffee(String name, Money price, Size size) {
        super(name, price);
        this.size = size;
    }

    /**
     * gets the price of the item
     *
     * @return money
     */

    @Override
    public Money getPrice() {
        return super.getBasePrice();
    }

    /**
     * this turn what you have into a name and prce
     *
     * @return string
     */
    @Override
    public String getReceiptItem() {
        String s = size.toString() + " " + super.getName() + super.getBasePrice().getAmountString() + "\n";
        return s;
    }

    /**
     * the coffee's name
     *
     * @return name
     */
    @Override
    public String toString() {
        return super.getName();
    }

}
