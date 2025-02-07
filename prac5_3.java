import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class prac5_3 
{
    public static void main(String[] args) throws IOException
    {
        Path dir = Paths.get("Documents");
        Path work = dir.resolve("Work");
        Path project_1 = work.resolve("project_1.txt");
        Path project_2 = work.resolve("project_2.txt");
        Path personal = dir.resolve("Personal");
        Path weekendPlan = personal.resolve("weekendPlan.txt");
        Path summerTrip = personal.resolve("summerTrip.txt");

        Files.createDirectories(work);
        Files.createDirectories(personal);
        Files.createFile(project_1);
        Files.createFile(project_2);
        Files.createFile(weekendPlan);
        Files.createFile(summerTrip);

        System.out.println(dir.toAbsolutePath());
    }
}
