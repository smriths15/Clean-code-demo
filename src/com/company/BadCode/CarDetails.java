package com.company.BadCode;

import java.util.Scanner;

public class CarDetails {

    public void list_cars()
    {
        String type = " ";
        System.out.println("Currently available models : ");
        System.out.println("1. Astor");
        System.out.println("2. Hector");
        System.out.println("3. Gloster");
        System.out.println("4.ZS EV");
        System.out.println("Pick a car :");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        fuel_type(choice);

    }
    public void fuel_type(int choice)
    {

       if(choice==1)
        {
            System.out.println("Petrol version available.");
            fuel_price(choice);
        }
        if(choice==2)
        {
            System.out.println("Diesel version available.");
            fuel_price(choice);
        }
        if(choice==3)
        {
            System.out.println("Petrol & Diesel version available.");
            fuel_price(choice);
        }
        if(choice==4)
        {
            System.out.println("Electric version available.");
        }

    }
    public void fuel_price(int choice)
    {
        if(choice == 1||choice==3)
        System.out.println("Current petrol price is 100.58");
        if(choice==2||choice==3)
        System.out.println("Current Diesel price 85.01");
    }
    public static void main(String []args)
    {
        CarDetails obj = new CarDetails();
        obj.list_cars();
    }

}
