package com.company.GoodCode;
/*
LSP - the subclass should be substitutable with its base class.
Any functionality in the parent must be completely be used in its child class. There shouldn't be any function that cannot
be extended into the child.

Example : We could add Fuel_price() within Fuel_type, but it cannot be extended by electric, cuz it doesn't need to display
fuel price. Hence, all functionalities are not be extended into the child class, and the child is not a full substitute of
the parent. Therefore, we create separate interfaces Fuel_Price and is implemented by the required classes only.
Now Fuel_type interface is fully extended by Petrol, diesel and electric and follows LSP.
 */

public interface FuelPrice {
    void Display_Fuel_Price();
}
