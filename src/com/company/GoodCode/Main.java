package com.company.GoodCode;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        CarDetails obj  = new CarDetails();
        PetrolType petrol = new PetrolType();
        DieselType diesel = new DieselType();
        ElectricType electric = new ElectricType();
        obj.list_cars();
        System.out.println("Pick a car :");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                petrol.Fuel();
                petrol.Display_Fuel_Price();
                break;

            case 2:
                diesel.Fuel();
                petrol.Display_Fuel_Price();
                break;

            case 3:
                petrol.Fuel();
                petrol.Display_Fuel_Price();
                diesel.Fuel();
                diesel.Display_Fuel_Price();
                break;

            case 4:
                electric.Fuel();
                break;
        }
    }
}
