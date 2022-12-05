package prog;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;
import cart.Item;
import cart.Apple;
import cart.Orange;

public class Main {
    public static void main(String[] args){
        // Item apple = new Item("SKU098098", "Apple");
        // Item orange = new Item("SKU098678", "Orange");


        // apple.setPrice(.5f);
        // apple.setQuantity(10);

        // orange.setPrice(.5f);
        // orange.setQuantity(11);

        // System.out.println(apple.totalCost());
        
        Apple apple = new Apple();
        apple.setType("washington");

        Orange orange = new Orange();

        System.out.printf("Apple code: %s", apple.getCode());
        System.out.printf("Orange code: %s", orange.getCode());

        Item item = apple;
        System.out.printf("item code: %s\n", item.getCode());

        //casting the apple back into apple Obj so we can getType
        Apple washington = (Apple)item;
        System.out.printf("item apple code: %s\n", washington.getCode());

        //casting a superclass into a subclass obj is NOT good.
        //this will throw an exception only when you try to run it
        //orange = (Orange)item; 

        //tells us if item is an instance of Orange, and to cast it back to Orange obj type if it is
        System.out.printf("is item an Orange? %b\n", item instanceof Orange);
        if (item instanceof Orange)
            orange = (Orange)item;

        //creating a shopping cart with these items =================================
        List<Item> shoppingCart = new LinkedList<>();

        Console cons = System.console();
        String userInput = ""; 
        String[] commandList = {};
        String command = "";
        Boolean stop = false;

        while (!stop){
            userInput = cons.readLine("add, or list items:");
            userInput = userInput.trim();

            //parse commands
            commandList = userInput.split(" "); 
            command = commandList[0];

            switch(command){
                case "login":
                    
                break;
                case "list":
                    for (Integer i = 0; i < shoppingCart.size(); i++ ){
                        System.out.printf("");
                    }
                    break;
                
                case "add":
                    String inputItem = commandList[1];
                    
                    switch(inputItem){
                        case "apple":
                        
                        break;
                        
                        case "orange":
                        break;
                    }
                    String transactionEntry = inputItem + quantity + unitspossesed + price;
                    
                    shoppingcart.add(transactionEntry);

                case "checkout":
                    // calculates the units and price
                    // adds all the units and prices together to give the total amount
                    Float totalPrice = unit * price of each item;
                    System.out.printf("The total price is %.2f.", totalPrice);
                
            }
        }
    }
}

/* more advanced stuff for the cart 
 * list<Item> instead of List<String>
 * list 
 * add item quantity unit price in one line
 * checkout the whole cart
 * the total price is 
 */
