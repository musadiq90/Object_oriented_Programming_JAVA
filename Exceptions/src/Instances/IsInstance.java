package Instances;

// Java program to demonstrate working of
// instanceof operator
public class IsInstance
{
    public static void main(String[] args)
    {
        Integer i = new Integer(5);

        // prints true as i is instance of class
        // Integer
        System.out.println(i instanceof Integer);
    }
}

 class Test
{
    public static void main(String[] args)
    {
        Integer i = new Integer(5);

        // Below line causes compile time error:-
        // Incompatible conditional operand types
        // Integer and String
       // System.out.println(i instanceof Double);
    }
}