import java.util.Scanner;

public class prac4_1
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in)) 
        {
            int a = 0, b = 2;
            try
            {
                System.out.print("Enter the first number : ");
                a = sc.nextInt();
                System.out.print("Enter the second number : ");
                b = sc.nextInt();
            }catch(Exception e)
            {
                System.out.println("Invalid input");
            }
            System.out.println("sum of integer is :" + (a + b));
        }    
    }
}

