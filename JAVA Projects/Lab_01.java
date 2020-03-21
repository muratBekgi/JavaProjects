import java.util.Date;
import java.util.*;
public class Lab_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 sides of the Triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter the color of the Triangle: ");
        String color = input.next();

        System.out.print("Is the Triangle filled(True or False)?  ");
        boolean filled=input.nextBoolean();

        Triangle1 triangle1 = new Triangle1(side1, side2, side3);
        triangle1.setFilled(filled);
        triangle1.setColor(color);

        System.out.println(triangle1.toString());
        System.out.println("Area: " + triangle1.getArea());
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Color: " + triangle1.getColor());
        System.out.println("Triangle is " + (triangle1.isFilled() ? "" : " not ")
                + "filled");

    }

}

class GeometricShape{
    protected String color="blue";
    protected boolean filled;
    Date dateCreated;

    GeometricShape(){};
    GeometricShape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){return color;}
    public void setColor(String color){this.color=color;}

    public boolean isFilled(){return filled;}
    public void setFilled(boolean filled){this.filled=filled;}

    public Date getDateCreated(){return dateCreated;}

    public String toString (){
        return "created on "+dateCreated+"\ncolor: "+color+
                " and filled: "+filled;
    }
}
class Triangle1 extends GeometricShape{
    double side1, side2, side3;

    public Triangle1(){
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }
    public Triangle1(double side1, double side2, double side3){

        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getArea(){
        double s=side1+side2+side3;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
       return side1+side2+side3;
    }
    public String toString(){
        return "triangle: side1="+side1+" side2="+side2+" side3="+side3;
    }

}
