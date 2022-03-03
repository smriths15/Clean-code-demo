package com.company.GoodCode;
/*Interface Segregation - no class should be forced to implement an interface that it does not use. Large interfaces
must be split into smaller ones so that only the necessary ones are implemented.

Dependency inversion - high level modules shouldn't depend on low level modules, but they should both depend on the
abstraction.
*/
public class ElectricType implements Type {

    @Override
    public void Fuel() {
        System.out.println("Electric model available");
    }
}
