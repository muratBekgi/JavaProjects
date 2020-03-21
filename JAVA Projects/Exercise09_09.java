import java.util.*;

public class Exercise09_09 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        RegularPolygon polygon1 = new RegularPolygon();

        System.out.println("Enter number of sides in Polygon2: ");
        int side1=sc.nextInt();

        System.out.println("Enter side length in Polygon2: ");
        double len1=sc.nextDouble();
        RegularPolygon polygon2 = new RegularPolygon(side1, len1);

        System.out.println("Enter number of sides in Polygon3: ");
        int side2=sc.nextInt();
        System.out.println("Enter side length in Polygon3: ");
        double len2=sc.nextDouble();
        RegularPolygon polygon3 = new RegularPolygon(side2, len2, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea()); //implement the getArea method in RegularPolygon
        System.out.println("Polygon 2 perimeter: " +
                polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " +
                polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());


        /*System.out.print("Enter number of sides for Polygon2: ");
        int numOfSidePol2=sc.nextInt();
        System.out.print("Enter side length Polygon2: ");
        double sideLengthPol2=sc.nextDouble();
        System.out.print("Enter number of sides for Polygon3: ");
        int numOfSidePol3=sc.nextInt();
        System.out.print("Enter side length Polygon3: ");
        double sideLengthPol3=sc.nextDouble();

        RegularPolygon regPolygon1=new RegularPolygon();
        RegularPolygon regPolygon2=new RegularPolygon(numOfSidePol2,sideLengthPol2);
        RegularPolygon regPolygon3=new RegularPolygon(numOfSidePol3,sideLengthPol3);

        System.out.println("-------------------------------------------------------");
        System.out.printf("Perimeter for 1st Polygon is "+regPolygon1.getPerimeter()
        +"  and area is %.4f.%n",regPolygon1.getArea());

        System.out.printf("Perimeter for 2nd Polygon is "+regPolygon2.getPerimeter()
                +" and area is %.4f.%n",regPolygon2.getArea());

        System.out.printf("Perimeter for 3rd Polygon is "+regPolygon3.getPerimeter()
                +" and area is %.4f.%n",regPolygon3.getArea());
        System.out.println("-------------------------------------------------------");
*/
    }
}

class RegularPolygon{
    private int n = 3;
    private double side = 1;
    private double x;
    private double y;

    public RegularPolygon() {
    }

    public RegularPolygon(int number, double newSide) {
        n = number;
        side = newSide;
    }

    public RegularPolygon(int number, double newSide, double newX, double newY) {
        n = number;
        side = newSide;
        x = newX;
        y = newY;
    }
        public void setN(int n){this.n=n;}
        public void setSide(double side){this.side=side;}
        public void setX(double x){this.x=x;}
        public void setY(double y){this.y=y;}

        public int getN(){return n;}
        public double getSide(){return side;}
        public double getX(){return x;}
        public double getY(){return y;}
        double getPerimeter(){return n*side;}
        double getArea(){return ((n*side*side)/(4.0*Math.tan(Math.PI/n)));}

    /*private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }

   RegularPolygon(int numOfSides, double sideLength){
        this();
        side=sideLength;
        n=numOfSides;
   }

   public RegularPolygon(int numOfSides, double sideLength, double x, double y){
        this(numOfSides, sideLength);
        x=this.x;
        y=this.y;
   }

    public void setN(int n){this.n=n;}
    public void setSide(double side){this.side=side;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}

    public int getN(){return n;}
    public double getSide(){return side;}
    public double getX(){return x;}
    public double getY(){return y;}
    double getPerimeter(){return n*side;}
    double getArea(){return ((n*side*side)/(4.0*Math.tan(Math.PI/n)));}*/
}