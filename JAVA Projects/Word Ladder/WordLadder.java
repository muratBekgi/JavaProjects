import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class WordLadder {
	private ArrayList<Node> list; // list representing the word graph
	private LinkedList<Vertex> route = new LinkedList<>(); // list representing the ladder


	public WordLadder() {
		list = new ArrayList<>();
	}

	/**
	 * Read the file containing the graph into list
	 *
	 * @param fileName
	 * @throws IOException
	 */
	public void loadWordtMap(String fileName) throws IOException {
		File infile = new File(fileName);
		try (Scanner in = new Scanner(infile);) {
			while (in.hasNextLine()) {
				// read a line
				String line = in.nextLine();
				// split into a String[] called tokens  based on “ “
				String[] tokens = line.split(" ");

				// create a new Node based on tokens[0]
				Vertex ver = new Vertex(tokens[0]);
				Node word = new Node(ver);
				// add the reset of the tokens to word.addPath()

				for (int i = 1; i < tokens.length; i++) {
					word.addPath(new Vertex(tokens[i]));
				}

				// add the word to “list”
				list.add(word);

			}
		}
	}


	/**
	 * Find the ladder between start and end city, if it exists. Otherwise return false
	 *
	 * @param start
	 * @param end
	 * @return
	 */
	public boolean findLadder(String start, String end) {
		Stack<Vertex> stack = new Stack<>();
		  LinkedList<Vertex> ladder = new LinkedList<>(); // visited list of vertices
		Vertex startWord = new Vertex(start);
		Vertex endWord = new Vertex(end);
		Vertex v;

			//Check to see if startWord and endWord are part of the graph. Otherwise, print
			// Error message and return false.
		int startingPoint=0;
		int endingPoint=0;

		for (int i = 0; i < list.size(); i++) {
			if(list.contains(new Node(startWord)))
				startingPoint++;
			if(list.contains(new Node(endWord)))
				endingPoint++;
		}
		if((startingPoint==0)|| (endingPoint==0)){
			System.out.println("\"ENTERED WORD\" Not part of the list!");
			return false;
		}

			// mark all cities as unvisited
			LinkedList<Vertex> visited = new LinkedList<>(); // visited list of vertices
          /* Add startWord to a Stack
	       Mark startWord as visited by adding it to visited
           While ( aStack not empty and have not found a path to destCity) {
             Get the path of the vertex at top of aStack
			 if( path is empty )
				Remove vertex from aStack
			Else {
				Remove any visited vertex from the path until you find an unvisited vertex (v)
				Add v to aStack
				Add v to visited
			} // end while
/            */



		stack.push(startWord);
		visited.push(startWord);

			while (!stack.empty() && !(stack.peek().equals(endWord))) {

				ArrayList<Vertex> path = list.get(list.indexOf(new Node(stack.peek()))).getPath();

				if (path.isEmpty()) {
					stack.pop();

				} else {
					v = null;
					for (int i = 0; i < path.size(); i++) {
						if (visited.contains(path.get(i)))
							path.remove(i);
						else {
							v = path.remove(i);
							break;
						}
					}
					if (v==null)
						stack.pop();
					else
					{

							stack.push(v);
							visited.add(v);
						}
					}


				}



			// Rebuild the ladder from startWord to endWord and print
			if (!stack.isEmpty()) {
				while (!stack.isEmpty())
					route.addFirst(stack.pop());


				System.out.println("Found path of " + route.size() + " cities");
				System.out.println(route);

				return true;

			}


			return false;

	} // end findLadder


} // end WordLadder



/**
 * A node in the graph is represented by a Vertex and path to other words
 */
class Node{
	private Vertex word;  // Graph vertex
	private ArrayList<Vertex> path; // list of vertices in the path
	public Node() {
		path = new ArrayList<>();
	}

	public Node(Vertex word) {
		this.word = word;
		path = new ArrayList<>();
	}

	public void setword(Vertex word) {
		this.word = word;
	}

	public Vertex getword() {
		return word;
	}

	public ArrayList<Vertex> getPath(){
		return path;
	}

	public void addPath(Vertex v) {
		path.add(v);
	}

	public String toString() {
		return word +"-->"+path;
	}

	public boolean equals(Object e) {
		Vertex v = ((Node)e).getword();
		return this.word.equals(v);
	}
}
