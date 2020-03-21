import java.io.IOException;
public class MazeTest{
    public static void main(String [] args)throws IOException {
        try {
            MazeSolver new_Maze=new MazeSolver("/Users/MUratBekgi/Desktop/maze0.txt");
            System.out.println(new_Maze);
            new_Maze.printMaze();

        }catch (Exception ex){
            System.out.println("Solution was not found");
        }
    }
}

