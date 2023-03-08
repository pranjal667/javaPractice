import java.util.*;
// import bank;

// //Compile Time Polymorphism
// class Student{
//     String name;
//     int age;
    
//     public void printInfo(String name){
//         System.out.println(name);
   
//     }

//     public void printInfo(int age){
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println(name + " " + age );
//     }
// }
 
// //Inheritance(4 types(single-level,multi-level, hirerchial, hybrid, multiple(only on c++) ))

// class Shape {
//     public void area() {
//         System.out.println("displays area");
//     }
// }

// class Triangle extends Shape{
//     public void area(int l , int h){
//         System.out.println(1/2*l*h);
//     }

// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(22/7*r*r);
//     }



// }

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

// interface Animal{
//     int eyes = 2;
//     void walk();
//     // void eat(){}  // cannot create function in interface!!

// }

// interface Herbivore{

// }

// class Horse implements Animal, Herbivore{
//     public void walk(){
//         System.out.println("walks on 4 legs.");
//     }
// }

class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newSchool";
    }
}

public class App {
    public static void main(String[] args) {
        
        //package creation

        // bank.Account account1 = new bank.Account();
        // account1.name = "customer1";
        
        //abstraction 

        // Horse horse = new Horse();
        // horse.walk();
        // horse.eat();
        //Animal animal = new Animal(); // cannot make object because it is an abstract class

        //static practice

        Student.school = "KU";
        Student student1 = new Student();
        student1.name = "Pranjal";

        System.out.println(student1.school);

        
        

    }
}

