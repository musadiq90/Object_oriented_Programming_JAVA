package OOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(".\\test.txt"));
            int x = reader.read();
            System.out.println(x);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
