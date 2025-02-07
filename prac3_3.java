import java.util.Scanner;

interface Recylable
{
    default void display()
    {
        System.out.println("Bottle returned for recycling");
    }
}

class Bottle
{
    private double volume;

    public double returnVolume()
    {
        return volume;
    }
}

class SodaBottle extends Bottle implements Recylable 
{
    private String soda_name;

@Override
    public String toString()
    {
        return soda_name + returnVolume();
    }
}

public class prac3_3 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            SodaBottle sb = new SodaBottle();
            double volume;
            String soda_name;

            System.out.print("Type in the name of the soda : ");
            soda_name = sc.nextLine();
            System.out.print("Type in the volume of the bottle : ");
            volume = sc.nextDouble();
            sb.toString();
            System.out.println(soda_name + "," + volume + "liters" );
            sb.display();
        }
    }
}