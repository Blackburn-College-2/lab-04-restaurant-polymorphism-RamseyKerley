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
    
    public Syrup(String flavor, Money price) {
        
        this.flavor = flavor;
    }

    @Override
    public Money getPrice() {
        return this.getPrice();
    }

    @Override
    public String getReceiptItem() {
        return flavor + " "  + this.getPrice().getAmountString() ;
        
    }

}
