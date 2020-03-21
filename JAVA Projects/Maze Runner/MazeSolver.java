import java.io.IOException;
import java.util.*;
import java.io.*;

public class MazeSolver {
    private char[][] maze;
    private int startY;
    private int startX;
    boolean solved;
    boolean wall = false;
    int row = 0;
    int col = 0;


    public MazeSolver(String fileName) throws IOException {


        // create an object to read information from fileName
        Scanner input = new Scanner(new File(fileName));


        row=input.nextInt();
        col=input.nextInt();
        input.nextLine();

        startX=0;
        startY=0;


        //new maze
        maze=new char[row][col];

        for(int i=0; i<row;i++){
            String nextLine=input.nextLine();
            for(int j=0; j<col;j++){
                char nextChar=nextLine.charAt(j);
                maze[i][j]=nextChar;
                System.out.print(nextChar);
            }
            System.out.println();
        }

        //starting point
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                if(maze[i][j]=='S'){
                    System.out.println("\nStarting point is: "+i+","+j+"\n");

                    startX=i;
                    startY=j;
                }
            }
        }
        solveMaze(maze,startX,startY);
    }

//recursive method to solve the maze
    public boolean solveMaze(char maze [][], int x, int y) {

        //recursive base cases
        if (x > maze.length - 1 || y > maze.length - 1){
        return false;
        }

        if (x < 0 || y < 0 && x>7) {
            return false;
        }

        if (maze[x][y] == 'G') {
            return true;
        }

        if (maze[x][y] == 'X' || maze[x][y]=='+') {
            return false;
        }
        maze[x][y] = '+';

        //recursive main cases
        if (solveMaze(maze, x + 1, y)) {
            return true;
        }
       else if (solveMaze(maze, x, y + 1)) {
            return true;
        }
        else if (solveMaze(maze, x - 1, y)) {
            return true;
        }
        else if (solveMaze(maze, x, y - 1)){
            return true;
        }



      maze[x][y]='#';

      return false;


    }

    //a method that prints the maze
    public void printMaze(){
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

}