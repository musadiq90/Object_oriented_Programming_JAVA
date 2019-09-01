package Connection;

import java.net.ServerSocket;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(9090);
            Socket s = server.accept();

            System.out.println("connect");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
