//Inheritance(4 types(single-level,multi-level, hirerchial, hybrid, multiple(only on c++) ))

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }

}

class Circle extends Shape{
    public void area(int r){
        System.out.println(22/7*r*r);
    }
}


public class Inheritance {
    
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.area(10,10);

    }
}
