// public class prac6_2 extends Thread 
// {
//     int[] salary = new int[5];
//     @Override
//     public void run() 
//     {
//         for (int j = 0; j < salary.length; j++) 
//         {
//             double temp = salary[j];
//             temp = temp + (temp * 0.05);
//             salary[j] = (int) temp;
//             System.out.println("Incremented salary : " + salary[j]);
//             try 
//             {
//                 Thread.sleep(2000,5000);
//             } catch (InterruptedException e) 
//             {
//                 System.out.println("interrupt occur ! ");
//             }
//         }
//     }

//     public static void main(String[] args) 
//     {
//         prac6_2 obj = new prac6_2();
//         for (int j = 0; j < 5; j++) 
//         {
//             obj.salary[j] = 50000 + (j*1000);
//         }
//         obj.start();
//     }
// }
