import java.io.*;
import  java.net.*;
public class client {
    public static void main(String[]args){
        Socket Socket=null;
        PrintWriter out=null;
        BufferedReader in=null;
        try{
            Socket=new Socket("Localhost",12345);
            out =new PrintWriter(Socket.getOutputStream(),true);
            in=new BufferedReader(new InputStreamReader(Socket.getInputStream()));
            out.println("Hello,Server:");
            String ServerResponse=in.readLine();
            System.out.println("Received from server :"+ServerResponse);
            in.close();
            out.close();
            Socket.close();}
        catch (UnknownHostException e) {
            System.out.println("Unknown host:LocalHost");
            e.getStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
