import java.util.*;

public class Generics {
    public static void main(String[] args) {

    }
}

 class TestGenerics4{

    public static < E > void printArray(E[] elements) {
        for ( E element : elements){
            System.out.print(element +" ");
        }
        System.out.println();
    }
    public static void main( String args[] ) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };

        System.out.println( "Printing Integer Array" );
        printArray( intArray  );

        System.out.println( "Printing Character Array" );
        printArray( charArray );
    }
}

class Test<T> {
    void m(List<String> arg) {
        System.out.println(arg);
    }


    public static void main(String[] args) {
        Test<String> t1 = new Test<>();
        //t1.m("a");

        Test<Integer> t2 = new Test<>();
        //t2.m(1);

        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("1");
        t1.m(l);

    }
}

 class Dog extends Test {

 }
 class Cat extends Test {

 }