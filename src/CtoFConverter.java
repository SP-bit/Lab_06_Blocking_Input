import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempCelsius = 0;
        String trash = ""; // use for bad input which will read as a String

        boolean done = false;
        do
        {
            System.out.print("Enter your temperature in Celsius: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                tempCelsius = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said your temp was: " + trash);
                System.out.println("Enter a valid temp!");
            }
        } while(!done);
        double tempFahrenheit = 32 + 1.8 * tempCelsius;
        System.out.println("The temperature of " + tempCelsius + " degrees C in Fahrenheit is " + tempFahrenheit + " degrees");
    }
}