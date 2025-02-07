// class Stack 
// {
//     private final int maxSize;
//     private int top;
//     private final int[] stackArray;

//     public Stack(int size) 
//     {
//         maxSize = size;
//         stackArray = new int[maxSize];
//         top = -1;
//     }

//     public synchronized void push(int value) 
//     {
//         while (top >= maxSize - 1) 
//         {
//             try 
//             {
//                 wait();
//             } catch (InterruptedException e) 
//             {
//                 System.out.println("Error: " + e.getMessage());
//             }
//         }
//         stackArray[++top] = value;
//         notify();
//     }

//     public synchronized int pop() 
//     {
//         while (top < 0) 
//         {
//             try 
//             {
//                 wait();
//             } catch (InterruptedException e) 
//             {
//                 System.out.println("Error: " + e.getMessage());
//             }
//         }
//         notify();
//         return stackArray[top--];
//     }
// }

// class Producer extends Thread 
// {
//     private final Stack stack;
//     private final int numItems;

//     public Producer(Stack stack, int numItems) 
//     {
//         this.stack = stack;
//         this.numItems = numItems;
//     }

//     @Override
//     public void run() 
//     {
//         for (int i = 1; i <= numItems; i++) 
//         {
//             stack.push(i);
//             System.out.println("Produced: " + i);
//             try 
//             {
//                 sleep(1000);
//             } catch (InterruptedException e) 
//             {
//                 System.out.println("Error: " + e.getMessage());
//             }
//         }
//     }
// }

// class Consumer extends Thread 
// {
//     private final Stack stack;
//     private final int numItems;

//     public Consumer(Stack stack, int numItems) 
//     {
//         this.stack = stack;
//         this.numItems = numItems;
//     }

//     @Override
//     public void run() 
//     {
//         for (int i = 1; i <= numItems; i++) 
//         {
//             int item = stack.pop();
//             System.out.println("Consumed: " + item);
//             try 
//             {
//                 sleep(1000);
//             } catch (InterruptedException e) 
//             {
//                 System.out.println("Error: " + e.getMessage());
//             }
//         }
//     }
// }

// public class prac6_4 
// {
//     public static void main(String[] args) 
//     {
//         Stack stack = new Stack(5);
//         Producer producer = new Producer(stack, 10); 
//         Consumer consumer = new Consumer(stack, 10); 
//         producer.start();
//         consumer.start();
//     }
// }
