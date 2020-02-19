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

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Money getPrice() {
       return super.getBasePrice();
    }

    @Override
    public String getReceiptItem() {
        String s = size.toString() +" "+ super.getName() + " " + super.getBasePrice().getAmountString() + "\n";
        return s;
    }

}
