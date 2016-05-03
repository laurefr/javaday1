package DataTypesAndControlStatements;

/**
 * Created by student on 03-May-16.
 */

import java.util.Scanner;

public class ControlStatements {

    public static void main(String[] args) {
        //SimpleIf();
        WhileLoopInfinite();
    }

    static void SimpleIf() {
        System.out.println("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        char number = scan.next().charAt(0);

        //check for a character or number.
        //if character - check upper or lower case
        //if number check whether its > 5 or not
        if (Character.isLetter(number) || Character.isDigit(number)) {
            System.out.println();
            if (Character.isUpperCase(number))
                System.out.println("Your char is upper case");
            else if (Character.isLowerCase(number))
                System.out.println("Your char is lower case");
            else if (number > 5)
                System.out.println("Your char is a digit and more than 5");
        } else
            System.out.println("Your char is not a number or char");

    }

    static void WhileLoopInfinite()
    {
        Scanner scan = new Scanner(System.in);
        int num;

        boolean keepgoing = true;
        //int counter = 0;
        while(keepgoing)
        {
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            if(num == 20) {
                keepgoing = false;
                System.out.println("You found 20!");
            }
        }
    }

    static void ForLoop()
    {
        System.out.println("Starting to count (for loop).");

        for (int i = 0; i < 100; i++)
        {
            System.out.println(i);
        }

        System.out.println("Finish Counting!");

    }

    static void ForEachLoop()
    {
        String[] data = { "This", "is", "a", "string", "array", "." };
        //declar and empty string
        String resultData = "";

        //variable is a place holder for the item in collection (data)
        //For example, when the lop first start s="This"
        for (String s : data)
        {
            resultData += String.format(s + " ");
        }
        System.out.println(resultData);
    }

    static void ForEachMulti()
    {
        int sum = 0;
        int nums[][] = new int[3][5];

        // give nums some values
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // use for-each for to display and sum the values
        //in case of two-dimensional array, the the iteration variable must be a reference to a one-dimensional array
        for(int x[] : nums) {
            for(int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }



}
