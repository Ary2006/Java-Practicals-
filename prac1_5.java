import java.util.*;

public class prac1_5 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a string : ");

        try (Scanner sc = new Scanner(System.in)) 
        {
            String str = sc.nextLine();
            System.out.println(Scramble(str));

            System.out.print("Enter your guess : ");
            String userstr = sc.nextLine();
            System.out.print(isAnagram(str, userstr));
        }
    }

    static String Scramble(String str) 
    {
        int n;
        Random random = new Random();
        char[] NewCharArray = str.toCharArray();

        for (int i = 0; i < NewCharArray.length; i++) 
        {
            n = random.nextInt(NewCharArray.length);
            char temp = NewCharArray[n];
            NewCharArray[n] = NewCharArray[i];
            NewCharArray[i] = temp;
        }
        return new String(NewCharArray);
    }

    static boolean isAnagram(String OriginalStr, String UserInput) 
    {
        int[] CharCount = new int[26];
        if (OriginalStr.length() != UserInput.length()) 
        {
            return false;
        }

        for (char c : OriginalStr.toCharArray()) 
        {
            CharCount[c - 'a']++;
        }
        for (char c : UserInput.toCharArray()) 
        {
            if (CharCount[c - 'a'] == 0) 
            {
                return false;
            }
            CharCount[c - 'a']++;
        }
        return true;
    }
}
