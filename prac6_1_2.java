public class prac6_1_2 implements Runnable
{
    @Override
    public void run() 
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args) 
    {
        prac6_1_1 obj = new prac6_1_1();
        Thread t = new Thread(obj);
        t.start();
    }
}
