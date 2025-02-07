import java.util.Scanner;

class point
{ 
    private int x;
    private int y;

    public point(int x, int y)
    {
        if(x > 100)
        {        
            this.x = 100;
        }       
        else if(x < 0)
        {        
            this.x = 0;
        }  
        else
        {
            this.x = x;
        }

        if(y > 100)
        {        
            this.y = 100;
        }       
        else if(y < 0)
        {        
            this.y = 0;
        }
        else
        {
            this.y = y;
        }
    }

    String tostring()
    {
        return "(" + x + "," + y + ")";
    }

    void move(int x, int y)
    {
        this.x += x;
        this.y += y;

        if(x > 100)
        {        
            this.x = 100;
        }       
        else if(x < 0)
        {        
            this.x = 0;
        }

        if(y > 100)
        {        
            this.y = 100;
        }       
        else if(y < 0)
        {        
            this.y = 0;
        }
    }
}

public class prac2_3
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner (System.in))
        {
            int x, y;

            System.out.print("Enter the x coordinate of the point : ");
            x = sc.nextInt();
            System.out.print("Enter the y coordinate of the point : ");
            y = sc.nextInt();

            point p = new point(x,y);
            System.out.println("Coordinates are : " + p.tostring());

            System.out.print("Enter the difference between the x coordinate : ");
            x = sc.nextInt();
            System.out.print("Enter the difference between the y coordinate : ");
            y = sc.nextInt();
            sc.close();

            p.move(x, y);

            System.out.print("New coordinates are : " + p.tostring());
        }
    }
}
