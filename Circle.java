public class Circle{
    private double radius;

    //Default constructor
    public Circle(){
        this.radius = 0;
    }

    //paramertized constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //setter
    public void setRadius(){
        this.radius = radius;
    }

    //getter
    public double getRadius(){
        return radius;
    }

    //Method to calculate Area
    public double getArea(){
return(Math.pi*radius*radius);
    }

    //circumference
    public double getCircumference(){
        return(2*Math.pi*radius*radius);
    }
   
    
    //main.java
    public static void main(String[]args){

        Circle C1 = new Circle(); //default
        Circle C2 = new Circle(); //parametrized

        System.out.println("Circle 1 = ");
C1.setRadius();
C1.getRadius();
C1.getArea();
C1.getCircumference();

system.out.print("Circle 2 = ");
C2.setRadius(); 
C2.getRadius();
C2.getArea();
C2.getCircumference();

//updating radius
C2.setRadius();
System.out.println("Circle 2 = ");
C2.getRadius();
C2.getArea();
C2.getCircumference();

    }
}