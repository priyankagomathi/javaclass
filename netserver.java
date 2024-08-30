import java.io.*;
import java.net.*;
public class netserver {
    public static void main(String[]args){
        ServerSocket Serversocket=null;
        Socket ClientSocket=null;
        try {
            Serversocket=new ServerSocket(12345);
            System.out.println("Server is Listening on port 12345");
            ClientSocket=Serversocket.accept();
            System.out.println("Client Connected");
            BufferedReader in=new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
            PrintWriter out=new PrintWriter(ClientSocket.getOutputStream(),true);
            String ClientMessage=in.readLine();
            System.out.println("Received From Client:"+ClientMessage);
            out.println("Message Received:"+ClientMessage);
            in.close();
            out.close();
            ClientSocket.close();
            Serversocket.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
