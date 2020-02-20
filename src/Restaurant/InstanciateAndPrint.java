/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import edu.blackburn.cs.cs212.restaurantbase.Currency;
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author ramsey.kerley
 */
public class InstanciateAndPrint {

    /**
     * this prints all the values that are made and the receipt
     */
    public void printThis() {
        Size s = new Size("small");
        Size m = new Size("meduim");
        Size l = new Size("large");
        Currency c = new Currency("Dollar", "$");
        Money small = new Money(c, 3.0);
        Money medium = new Money(c, 5.0);
        Money large = new Money(c, 7.0);
        Money change = new Money(c, 0.5);

        Coffee frappe = new Coffee("frappe $", small, s);
        Coffee latte = new Coffee("latte $", medium, m);
        Coffee coffee = new Coffee("coffee $", large, l);
        Coffee icecreamCoffee = new Coffee("ice Coffee $", small, s);
        Coffee fish = new Coffee("fish $", medium, m);
        FancyCoffee cap = new FancyCoffee("capichino $", medium, m);
        Syrup caramel = new Syrup("caramel", change);
        cap.add(caramel);
        
        Topping t = new Topping("sprinkles ", change);
        
        Sandwich sam = new Sandwich(medium);
        Meat meat = new Meat("ham", change);
        
        
        
        

        Receipt r = new Receipt();
        r.add(frappe);
        r.add(latte);
        r.add(coffee);
        r.add(icecreamCoffee);
        r.add(fish);
        r.add(cap);
        r.add(caramel);
        r.add(t);
        r.add(sam);
        r.add(meat);

        System.out.println(r.prepare());

    }

}
