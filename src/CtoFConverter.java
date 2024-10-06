import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempCelsius = 0;
        String trash = "";

        boolean done = false;
        do
        {
            System.out.print("Enter your temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                tempCelsius = in.nextDouble();
                in.nextLine();
                done = true;
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