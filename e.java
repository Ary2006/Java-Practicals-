// class MyException extends Exception 
// { 
//     private final int detail;
//     MyException(int a) 
//     {
//         detail = a;
//     } 
//     @Override
//     public String toString() 
//     { 
//         return "MyException [" + detail + "]"; 
//     } 
// }

// class ExceptionDemo
// { 
//     static void compute (int a) throws MyException 
//     { 
//         System.out.println("Called compute(" + a + ")");
//         if (a > 10) 
//         throw new MyException(a); 
//         System.out.println("Normal exit"); 
//     } 

//     public static void main(String args[]) 
//     { 
//         try 
//         { 
//             compute (1); 
//             compute (20); 
//         } catch (MyException e) 
//         { 
//             System.out.println("Caught" + e); 
//         } 
//     } 
// }

class e extends Thread
{
    @Override
    public void run()
    {  
        System.out.println(Thread.currentThread().getName());  
    }

    public static void main(String args[])
    {  
        e t1 = new e();  
        System.out.println("Name of t1:"+t1.getName());
        t1.setName("Student");
        t1.start();  
    }  
}