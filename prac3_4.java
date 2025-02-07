import harmonic.harmonic;
import java.util.Scanner;

public class prac3_4 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter the number of terms : ");
            int n = sc.nextInt();
            harmonic h =new harmonic();
            System.out.println(h.harmonic1(n));
        }
    }
}

