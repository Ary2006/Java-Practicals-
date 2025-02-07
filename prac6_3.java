// class MyThread extends Thread 
// {
//     @Override
//     public void run() 
//     {
//         for (int i = 0; i < 5; i++) 
//         {
//             System.out.println(Thread.currentThread().getName());
//             try 
//             {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) 
//             {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class prac6_3 
// {
//     public static void main(String[] args) 
//     {
//         MyThread dhoni = new MyThread();
//         dhoni.setName("Dhoni");
//         dhoni.start();
//         try 
//         {
//             dhoni.join();
//         } catch (InterruptedException e) 
//         {
//             e.printStackTrace();
//         }

//         MyThread kohli = new MyThread();
//         kohli.setName("Kohli");
//         kohli.start();
//         try 
//         {
//             kohli.join();
//         } catch (InterruptedException e) 
//         {
//             e.printStackTrace();
//         }

//         MyThread hardik = new MyThread();
//         hardik.setPriority(Thread.MIN_PRIORITY);
//         hardik.setName("Hardik");
//         hardik.start();
//         try 
//         {
//             hardik.join();
//         } catch (InterruptedException e) 
//         {
//             e.printStackTrace();
//         }
//     }
// }
