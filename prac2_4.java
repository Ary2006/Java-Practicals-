import java.util.Scanner;

class GasMeter
{
    private float Fuel_95;
    private float Fuel_98;
    private float Fuel_diesel;
    private float Fuel_total;

    void calculate_95(float get_95)
    {
        this.Fuel_95 = get_95;
        this.Fuel_total += get_95;
    }

    void calculate_98(float get_98)
    {
        this.Fuel_98 = get_98;
        this.Fuel_total += get_98;
    }

    void calculate_diesel(float get_diesel)
    {
        this.Fuel_diesel = get_diesel;
        this.Fuel_total += get_diesel;
    }

    void display()
    {
        System.out.println("Total used fuel : " + this.Fuel_total);
        System.out.println("Total used 95 octane fuel : " + this.Fuel_95);
        System.out.println("Total used 98 octane fuel : " + this.Fuel_98);
        System.out.println("Total used diesel fuel : " + this.Fuel_diesel);
    }
}

public class prac2_4 
{
    public static void main(String[] args) 
    {    
        try(Scanner scanner = new Scanner(System.in))
        {
            GasMeter gas = new GasMeter();
            int choice;
            float get_95, get_98, get_diesel;

            while(true)
            {
                System.out.print("what do you want: 1=95, 2=98, 3=Diesel (type any other number to quit) : ");
                choice = scanner.nextInt();

                switch(choice)
                {

                    case 1 ->                     
                    {
                        System.out.print("How much do you want to refuel : ");
                        get_95 = scanner.nextFloat();
                        gas.calculate_95(get_95);
                    }

                    case 2 ->                     
                    {
                        System.out.print("How much do you want to refuel : ");
                        get_98 = scanner.nextFloat();
                        gas.calculate_98(get_98);
                    }

                    case 3 ->                     
                    {
                        System.out.print("How much do you want to refuel : ");
                        get_diesel = scanner.nextFloat();
                        gas.calculate_diesel(get_diesel);
                    }
                }

                if (choice < 1 || choice > 3)
                {
                    break;
                }
            }

        gas.display();
        scanner.close();

        }
    }
}