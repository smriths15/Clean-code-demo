package com.company.GoodCode;

public class PetrolType implements Type, FuelPrice{

    @Override
    public void Fuel() {
        System.out.println("Petrol version available.");
        //any implementation as required for petrol cars
    }

    @Override
    public void Display_Fuel_Price() {
        System.out.println("Today's petrol price : Rs. 100.58");
        //display petrol price
    }
}
