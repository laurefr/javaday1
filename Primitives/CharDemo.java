package Primitives;

/**
 * Created by AlexK on 21/04/2016.
 *
 * EXAMPLE 2
 */
public class CharDemo {

    public static void main(String[] args)
    {
        char ch1, ch2;
        ch1 = 88; // code for X
        ch2 = 'Y';
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);

        char ch3;
        ch3 = 'X';
        System.out.println("ch3 contains " + ch1);
        ch1++; // increment ch1
        System.out.println("ch3 is now " + ch1);
    }
}
