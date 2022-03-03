package com.company.GoodCode;

public class DieselType implements Type, FuelPrice{

    @Override
    public void Fuel() {
        System.out.println("Diesel version available.");
        //any implementation as required for diesel cars
    }

    @Override
    public void Display_Fuel_Price() {
        System.out.println("Today's diesel price : Rs. 85.01");
        //display diesel price
    }
}
