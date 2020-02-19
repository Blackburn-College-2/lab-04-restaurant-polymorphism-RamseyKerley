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

    ArrayList<Orderable> addOn;

    FancyCoffee(String name, Money basePrice, Size size) {
        super(name, basePrice, size);
        
    }
    
    
    public void add(){
        addOn.add(this);
    }
}
