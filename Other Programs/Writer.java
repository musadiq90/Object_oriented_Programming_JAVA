package OOP;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Writer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(".\\test.txt"));
            writer.write(score);
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
