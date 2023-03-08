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

        //static practice

        Student.school = "KU";
        Student student1 = new Student();
        student1.name = "Pranjal";

        System.out.println(student1.school);

        
        

    }
}

