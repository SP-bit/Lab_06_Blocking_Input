import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        String trash = "";
        boolean done = false;
        boolean doneTwo = false;
        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said the width was: " + trash);
                System.out.println("Enter a valid width!");
            }
        } while(!done);
        do
        {
            System.out.print("Enter the length of the rectangle: ");
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                doneTwo = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said the length was: " + trash);
                System.out.println("Enter a valid length!");
            }
        } while(!doneTwo);
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("The area of your rectangle is: " + area);
        System.out.println("The perimeter of your rectangle is " + perimeter);
        System.out.println("The diagonal length of your rectangle is: " + diagonal);
    }
}