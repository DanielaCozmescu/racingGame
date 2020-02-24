package org.fasttrackit;

//  Car Race

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the racing game!" );

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;

        //concatenation
        System.out.println("Properties of " + carReference.name);
        //color red
        System.out.println("Color: " + carReference.color);
        // max speed 260
        System.out.println("Maximum speed: " + carReference.maxSpeed);
        // mileage 6.2
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing nr: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);

        carReference = null;

        Car car2 = new Car();
        car2.name = "Lamborghini";
        car2.damaged = true;
        System.out.println("Properties of " + car2.name);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Color: " + car2.color);
    }
}
