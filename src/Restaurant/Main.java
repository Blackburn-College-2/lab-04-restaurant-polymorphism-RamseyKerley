/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import edu.blackburn.cs.cs212.restaurantbase.*;

/**
 *
 * @author Ramsey Kerley
 */
public class Main {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Size s = new Size();
       Currency c =new Currency("Dollar","$");
        Money n = new Money(c,3.0);
        Money y = new Money(c,5.0);
        Money t = new Money(c,7.0);
        
        
        
        Coffee frappe = new Coffee("frappe", n);
        Coffee latte = new Coffee("latte", y);
        Coffee coffee = new Coffee("coffee", n);
        Coffee icecreamCoffee = new Coffee("icc", t);
        Coffee fish = new Coffee("fish", y);
        
        
        
        Receipt r = new Receipt();
        r.add(frappe);
         r.add(latte);
         r.add(coffee);
         r.add(icecreamCoffee);
         r.add(fish);
         
         System.out.println(r.prepare());
        
        
        
    }
    
}
