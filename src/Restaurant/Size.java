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
public class Size extends Measurement {

    String name;

    public Size(String name) {
        this.name = name;
    }
    /**
     * gives the size
     * @return size
     */
    @Override
    public String toString() {
        return name;
    }

}
