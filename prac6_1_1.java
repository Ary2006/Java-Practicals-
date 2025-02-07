public class prac6_1_1 implements Runnable
{
    @Override
    public void run() 
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args) 
    {
        prac6_1_1 runnable = new prac6_1_1();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
