package Primitives;

/**
 * Created by AlexK on 21/04/2016.
 *
 * EXAMPLE 5
 */
public class LifeTime {

    public static void main(String[] args)
    {

        int x;
        for(x = 0; x < 3; x++)
        {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
