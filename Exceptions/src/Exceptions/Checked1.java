package Exceptions;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
public class Checked1 {
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = null;
	/*This constructor FileInputStream(File filename)
	 * throws FileNotFoundException which is a checked
	 * exception
         */
        fis = new FileInputStream("B:/myfile.txt");
        int k;

	/* Method read() of FileInputStream class also throws
	 * a checked exception: IOException
         */
        while(( k = fis.read() ) != -1)
        {
            System.out.print((char)k);
        }

	/*The method close() closes the file input stream
	 * It throws IOException*/
        fis.close();
    }
}

/**
 * arthimitic is the type of the unchecked exception
 * here in the following code, fisrt i try iy without try and catch
 * it was error at run time but not a t compile time.
 */

class Uncheked1 {
    public static void main(String args[]) {
        try {
            int num1 = 10;
            int num2 = 0;
	/*Since I'm dividing an integer with 0
	 * it should throw ArithmeticException
         */
            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("arthimitic exception is here");
        }
    }
}