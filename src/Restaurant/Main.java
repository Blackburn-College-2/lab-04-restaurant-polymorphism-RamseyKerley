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
        Size s = new Size("small");
        Size m = new Size("meduim");
        Size l = new Size("large");
        Currency c = new Currency("Dollar", "$");
        Money small = new Money(c, 3.0);
        Money medium = new Money(c, 5.0);
        Money large = new Money(c, 7.0);
        Money change = new Money(c, 5.0);
         
        Coffee frappe = new Coffee("frappe", small, s);
        Coffee latte = new Coffee("latte", medium, m);
        Coffee coffee = new Coffee("coffee", large, l);
        Coffee icecreamCoffee = new Coffee("ice Coffee", small, s);
        Coffee fish = new Coffee("fish", medium, s);

        Receipt r = new Receipt();
        r.add(frappe);
        r.add(latte);
        r.add(coffee);
        r.add(icecreamCoffee);
        r.add(fish);

        System.out.println(r.prepare());

    }

}
