import java.util.Scanner;

interface Recyclable
{
    default void display()
    {
        System.out.println("Give proper input");
    }
}

class Fabric implements Recyclable
{
@Override
    public String toString()
    {
        return "Fabric recycled...";
    }
}

class Bottel implements Recyclable
{
@Override
    public String toString()
    {
        return "Bottel recycled...";
    }
}

class Paper implements Recyclable
{
@Override
    public String toString()
    {
        return "Paper recycled...";
    }
}

public class prac3_2 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            Fabric f = new Fabric();
            Bottel b = new Bottel();
            Paper p = new Paper();
            int a;

            while(true) 
            { 
                System.out.println("What do you want to recycle? Choose a number.");
                System.out.println("1 - Clothes");
                System.out.println("2 - Bottles");
                System.out.println("3 - Newspapers");
                System.out.println("4 - Exit");
                System.out.print("Choose a Number : ");
                a = sc.nextInt();

                switch(a)
                {
                    case 1:
                        System.out.println(f.toString());
                        break;

                    case 2:
                        System.out.println(b.toString());
                        break;

                    case 3:
                        System.out.println(p.toString());
                        break;

                    case 4:
                        System.out.println("Thanks for coming...");
                        System.exit(0);

                    default:
                        f.display();
                        System.out.print("Choose another number : ");
                        a = sc.nextInt();
                        if (a < 1 || a > 3)
                        {
                            break;
                        }
                }
            }
        }
    }
}
