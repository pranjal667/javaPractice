//Abstraction

// abstract class Animal{
//     abstract void walk();
//     Animal(){
//         System.out.println("creating a new Animal.");
//     }
//     public void eat(){
//         System.out.println("Animal eats");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("created a Horse.");
//     }
//     public void walk(){
//         System.out.println("walks on 4 legs.");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs.");
//     }
// }

//interface in Abstraction

interface Animal{
    int eyes = 2;
    void walk();
    // void eat(){}  // cannot create function in interface!!

}

interface Herbivore{

}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs.");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.walk();
        //horse.eat();
        //Animal animal = new Animal(); // cannot make object because it is an abstract class     

    }
}
