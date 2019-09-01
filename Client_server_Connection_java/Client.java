package Connection;
import java.net.*;
public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("110.37.230.34",9090);
            System.out.println("connected");
        }
        catch(Exception a){
            a.printStackTrace();
        }

    }
}
