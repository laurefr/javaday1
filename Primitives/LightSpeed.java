package Primitives;

/**
 * Created by AlexK on 21/04/2016.
 *
 * EXAMPLE 1
 */

public class LightSpeed {

    static void distanceCalculator()
    {
        // Evenson et all - calculated 299,792,458 metres / second
        // 1 mile = 1609.34 metres
        // approximate speed of light in miles per second
        int lightSpeed = 186000;

        long days;
        long seconds;
        long distance;

        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }

    public static void main(String[] args)
    {
        distanceCalculator();

        int value = 0b01111111;
        System.out.println(value);
        int value2 = 0b10000000;
        System.out.println(value2);

    }

}
