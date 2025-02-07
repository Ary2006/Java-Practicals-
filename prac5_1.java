import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Person 
{
    private final String info;

    public Person(String info) 
    {
        this.info = info;
    }

    @Override
    public String toString() 
    {
        return info;
    }
}

class ClientsInFile 
{
    int readInfo(Person[] persons) 
    {
        int count = 0;
        String filename = "D:\\JAVA\\JAVA LAB\\clients.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) 
        {
            String line;
            while ((line = br.readLine()) != null && count < persons.length) 
            {
                persons[count] = new Person(line);
                count++;
            }
        } catch (IOException e) 
        {
            System.out.println("Error handeling file " + e.getMessage());
        }
        return count;
    }
}

public class prac5_1 
{
    public static void main(String[] args) 
    {
        ClientsInFile clf = new ClientsInFile();
        Person p[] = new Person[5];
        int clients = clf.readInfo(p);

        for (int i = 0; i < clients; i++)
        {
            System.out.println(p[i].toString());
        }
    }
}

