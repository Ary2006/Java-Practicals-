import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class prac5_2 
{
    public static void main(String[] args) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\JAVA LAB\\grades.txt"))) 
        {
            try (BufferedWriter fw = new BufferedWriter(new FileWriter("D:\\JAVA\\JAVA LAB\\result.txt"))) 
            {
                String line;
                while ((line = br.readLine()) != null) 
                {
                    int grade = Integer.parseInt(line.trim());
                    if (grade < 10) 
                    {
                        grade++;
                    }
                    fw.write(String.valueOf(grade));
                    fw.newLine();
                }
                fw.close();
                br.close();
            }
        } catch (IOException e) 
        {
            System.out.println("Error handeling file " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\\\JAVA\\\\JAVA LAB\\\\result.txt"))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) 
        {
            System.out.println("Error handeling file " + e.getMessage());
        }
    }
}
