import java.util.*;

class Overloading
{
    public String stringM(String str)
    {
        str = str.toUpperCase();
        str = str.replace('A', 'Z');
        System.out.println(str);
        return str;
    } 

    public String stringM(String str, int a)
    {
        if(str.contains(" ") && a<=10)
        {
            String[] str1 = str.split(" ");
            String str2 = str1[0];
            String str3 = str1[1];
            str = str2 + str3.replace(str3, "CHARUSAT");
            System.out.println(str);
            return str;
        }
        else if(str.contains(" ") && a > 10)
        {
            str = str.toLowerCase();
            System.out.println(str);
            return str;
        }
        else
        {
            return "Invalid output";
        }
    }
}

public class prac2_5 
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            Overloading o = new Overloading();

            while(true)
            {
                System.out.print("Enter string : ");
                String str = sc.nextLine();
                if(!str.contains(" "))
                {
                    o.stringM(str);
                    System.out.println("Length of string is : " + str.length());
                }
                else 
                {
                    o.stringM(str , str.length());
                }

                System.out.print("Do you want to continue (y/n) ? ");
                char ch = sc.next().charAt(0);
                sc.nextLine();
                if(ch == 'Y' || ch =='y') {}
                else break;
            }
        }
    }
}