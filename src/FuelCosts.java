import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fuelTank = 0;
        double fuelEconomy = 0;
        double fuelCost = 0;
        String trash = "";
        boolean done = false;
        boolean doneTwo = false;
        boolean doneThree = false;
        do
        {
            System.out.print("Enter how many gallons of gas your car can have: ");
            if(in.hasNextDouble())
            {
                fuelTank = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said the gas in your car's tank was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }
        while(!done);
        do
        {
            System.out.print("Enter the car's fuel efficiency in miles per gallon: ");
            if(in.hasNextDouble())
            {
                fuelEconomy = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                doneTwo = true; // we got a valid number so we can end the loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said your car's fuel efficiency in miles per gallon is : " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }
        while(!doneTwo);
        do
        {
            System.out.print("Enter the fuel cost in dollars per gallon: ");
            if(in.hasNextDouble())
            {
                fuelCost = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                doneThree = true; // we got a valid number so we can end the loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said the fuel cost was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }
        while(!doneThree);
        double gallonsRequired = (100 / fuelEconomy);
        double cost100Miles = fuelCost * gallonsRequired;
        System.out.println("The fuel cost to drive 100 miles in dollars is: " + cost100Miles);
        double range = fuelEconomy * fuelTank;
        System.out.println("With a full tank of gas, your car can go: " + range +" miles");
    }
}