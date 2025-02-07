import java.util.*;

public class prac1_4
{
    private static final char[] Alphabet =
        {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

    private static final String []MORSELETTERS = 
        {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;

        while(true)
        {
            System.out.println("\n\nEnter 1 for String to Morse code conversation");
            System.out.println("Enter 2 for Morse code to String conversation");
            System.out.println("Enter 3 for exit");
            System.out.print("Enter your choice : ");
            num = sc.nextInt();
            sc.nextLine();

            switch(num)
            {
                case 1 -> StringtoMorse(sc);

                case 2 -> MorseTostring(sc);

                case 3 -> 
                {
                    System.out.println("Thank you for using Morse Code Converter!");
                    System.exit(0);
                }
            }
        }
    }

    static void StringtoMorse(Scanner sc)
    {
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        System.out.print("Morse code :");
        for(char c : str.toCharArray())
        {
            for(int i = 0 ; i < Alphabet.length ; i++)
            {
                if(c == Alphabet[i])
                {
                    System.out.print(MORSELETTERS[i] + " ");  
                    break; 
                }
            }   
        }
    }

    static void MorseTostring(Scanner sc)
    {
        System.out.print("\nEnter Morse Code : ");
        String str = sc.nextLine();

        String []morseWords = str.split(" ");
        System.out.print("String :");
        for(String word : morseWords)
        {
            for(int i = 0 ; i < MORSELETTERS.length ; i++)
            {
                if(word.equals(MORSELETTERS[i]))
                {
                    System.out.print(Alphabet[i]);
                    break;
                }
            }       
        }
    }
} 