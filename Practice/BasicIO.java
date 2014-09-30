import java.io.*;
import java.util.*;

/**
 * Write a description of class BasicIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicIO
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BasicIO
     */
    public BasicIO()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = scanner.nextLine();
        System.out.println(input);
        
        String hello = "Hello World";
        int[] arr = {2,3,9,9,34,7,1,75,26,1,8};
        System.out.println(Arrays.toString(arr));
        
        for (char a: hello.toCharArray())
        {
            System.out.println(a);
        }
    }
}


