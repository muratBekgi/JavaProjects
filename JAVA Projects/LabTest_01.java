import java.util.*;
class GeometricObjects{}

class Triangle extends GeometricObjects{
    double side1,side2,side3;

    Triangle(){
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }
    Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getSide1(){return side1;}
    public void setSide1(double side1){this.side1=side1;}

    public double getSide2(){return side2;}
    public void setSide2(double side2){this.side2=side2;}

    public double getSide3(){return side3;}
    public void setSide3(double side3){this.side3=side3;}

    public double getArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
    }
    public double getPerimeter(){
        return (side1+side2+side3);
    }

    public String toString(){
        return "triangle: side1="+side1+" side2="+side2+" side3="+side3;
    }

}
public class LabTest_01 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1=input.nextInt();
        System.out.print("Enter side2: ");
        double side2=input.nextInt();
        System.out.print("Enter side3: ");
        double side3=input.nextInt();
        System.out.print("Enter the color: ");
        String color=input.next();

        Triangle triangle=new Triangle(side1,side2,side3);

        System.out.println(triangle.getArea()+"\n");
        System.out.println(triangle.getPerimeter()+"\n");
        System.out.println(color);
        System.out.println(triangle.toString());



    }

}
