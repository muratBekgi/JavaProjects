
//
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

  public class Driver1 {
    private static ArrayList<Point> points= new ArrayList<Point>();
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int pointX, pointY=0;
        System.out.println("Welcome to Project 1: Boundaries\n" +
                "Loading points from input.txt");

        try{
            File file=new File("PATH TO THE FILE input.txt");
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String lines = null;
            while((lines=bufferedReader.readLine())!=null){
                assert false;
                String [] temp=lines.split(" ");
                pointX=Integer.parseInt(temp[0]);

                points.add(new Point(pointX,pointY));
            }
            fileReader.close();
        }catch (IOException ex){
            System.out.println("File was not found!");
        }
        convexHull();
        while(true){
            System.out.println("Test point: ");
            String points_XY=input.nextLine();
            if(points_XY.equalsIgnoreCase("quit")){
                System.exit(1);
            }
            String [] given=points_XY.split(" ");
            pointX=Integer.parseInt(given[0]);
            pointY=Integer.parseInt(given[1]);
            boolean result=false;
            if(((pointX+pointY)%2)!=0){
                result=true;
                System.out.println("Inside\n");
            }
            if(!result)
                System.out.println("Outside\n");
        }
    }

    private static void convexHull(){
        if(points.size()<=2)
            return;;
            int[] next =new int[points.size()];
        for (int i = 0; i < points.size(); i++)
            next[i]=-1;
        int j=0;
        for (int k = 1; k < points.size(); k++)
                if(points.get(k).x<points.get(j).x)
                    j=k;
         int p=j,q;
         do{
             q=(p+1)%points.size();
             for (int i = 0; i < points.size(); i++)
                 if(orientation(points.get(p),points.get(i),points.get(q))==2)
                     q=i;
              next[p]=q;
                 p=q;
         } while (p!=j);
    }

    private static int orientation(Point p, Point q, Point k){
        int value=(q.y-p.y)*(k.x-q.x)-(q.x-p.x)*(k.y-q.y);
        if(value==0)
            return 0;
        return (value>0)? 1:2;
    }
}


