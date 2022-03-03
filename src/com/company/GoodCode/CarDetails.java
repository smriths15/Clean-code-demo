package com.company.GoodCode;
/*

Single responsibility principle
This class changes only for 1 reason, i.e, to add or remove any new car models.

By default, since the program follows OCP and LSP, it also follows DIP. Because DIP depends on abstraction.
And now the high level modules are independent of the low level ones because of the abstraction(interface).

*/

import java.util.*;
public class CarDetails {
    public void list_cars()
    {   //Lists various cars
        //Astor(petrol)
        //Gloster(diesel)
        //Hector(petrol or diesel)
        //--> ZS EV(electric) --> here I added a newly launched model.
        System.out.println("Currently available models : ");
        System.out.println("1. Astor");
        System.out.println("2. Hector");
        System.out.println("3. Gloster");
        System.out.println("4.ZS EV");
    }
}
