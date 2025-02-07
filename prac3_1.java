// abstract class instrument
// {
//     abstract void play();
//     String what()
//     {
//         return "instrument";
//     }
//     abstract void adjust();
// }

// class Wind extends instrument
// {
//     @Override
//     void play()
//     {
//         System.out.println("Wind instrument played");
//     }

//     @Override
//     String what()
//     {
//         return "Wind";
//     }

//     @Override
//     void adjust()
//     {
//         System.out.println("Instrument tuned properly");
//     }
// }

// class Percusion extends instrument
// {
//     @Override
//     void play()
//     {
//         System.out.println("Percusion instrument played");
//     }

//     @Override
//     String what()
//     {
//         return "Percusion";
//     }

//     @Override
//     void adjust()
//     {
//         System.out.println("Instrument tuned properly");
//     }
// }

// class Stringed extends instrument
// {
//     @Override
//     void play()
//     {
//         System.out.println("Stringed instrument played");
//     }

//     @Override
//     String what()
//     {
//         return "Stringed";
//     }

//     @Override
//     void adjust()
//     {
//         System.out.println("Instrument tuned properly");
//     }
// }

// class Woodwind extends Wind
// {
//     @Override
//     void play()
//     {
//         System.out.println("WoodWind instrument played");
//     }

//     @Override
//     String what()
//     {
//         return "WoodWind";
//     }
// }

// class Brass extends Wind
// {
//     @Override
//     void play()
//     {
//         System.out.println("Brass instrument played");
//     }

//     @Override
//     void adjust()
//     {
//         System.out.println("Instrument tuned properly");
//     }
// }
// public class prac3_1
// {
//     public static void main(String[] args)
//     {

//         Woodwind w = new Woodwind();
//         Brass b = new Brass();

//         w.play();
//         w.what();
//         System.out.println(w.what());
//         b.play();
//         b.adjust();
//     }
// }
