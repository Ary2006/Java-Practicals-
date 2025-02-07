import java.util.Scanner;

class SmallException extends Exception 
{
    SmallException(String str) 
    {
        super(str);
    }
}

class BigException extends Exception 
{
    BigException(String str) 
    {
        super(str);
    }
}

class OwnException 
{
    public void printErrorReport(Exception e) 
    {
        System.out.println(e.getMessage());
    }

    public void testValue(int x) throws SmallException, BigException 
    {
        if (x < 5) 
        {
            throw new SmallException("Value is smaller than 5.");
        } 
        else if (x > 10) 
        {
            throw new BigException("Value is bigger than 10.");
        }
        else 
        {
            System.out.println("The value is between 5 and 10");
        }
    }
}

public class prac4_2 
{   
    public static void main(String[] args)  
    {
        OwnException obj = new OwnException();
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter the number : ");
            int a = sc.nextInt();
            try 
            {
                obj.testValue(a);
            } 
            catch (SmallException | BigException e) 
            {
                obj.printErrorReport(e);
            }
        }
    }
}
