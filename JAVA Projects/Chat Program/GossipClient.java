package Client;
import java.io.*;
import java.net.*;
public class GossipClient
{
  private static BufferedReader receiveRead;

  public static void main(final String[] args) throws Exception {
    final Socket sock = new Socket("127.0.0.1", 3000);
    // reading from keyboard (keyRead object)
    final BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
    // sending to client (pwrite object)
    final OutputStream ostream = sock.getOutputStream();
    final PrintWriter pwrite = new PrintWriter(ostream, true);

    // receiving from server ( receiveRead object)
    final InputStream istream = sock.getInputStream();
    receiveRead = new BufferedReader(new InputStreamReader(istream));

     System.out.println("Start the chitchat, type and press Enter key");

     String receiveMessage, sendMessage;               
     while(true)
     {
        sendMessage = keyRead.readLine();  // keyboard reading
        pwrite.println("Client:"+sendMessage);       // sending to server
        pwrite.flush();                    // flush the data
        if((receiveMessage = receiveRead.readLine()) != null) //receive from server
        {
            System.out.println(receiveMessage); // displaying at DOS prompt
        }         
      }               
    }                    
}                        
