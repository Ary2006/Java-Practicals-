import java.util.Scanner;

public class prac1_2
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            String str = sc.nextLine();
            sc.close();
            operatorcode(str);
        }
    }

    public static void operatorcode(String str)
    {
        String []code = str.split("-");
        System.out.println("Mobile system operator code is " + code[1]);
        System.out.println("MSC is " + code[2]);
        System.out.println("Unique code is " + code[3]);
    }
}



