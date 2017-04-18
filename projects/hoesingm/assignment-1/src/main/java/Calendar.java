//********************************************************
//Name: Mitch Hoesing			Folder Name:HoesingM_L6
//CS 161 Winter 2012			Lab #: 6
//Tues/Thurs 1:00pm
//Date: 2/18/2012
//Program Name: Calendar.java
//						Test Oracle:
//			Year						Result
//          1590                        No
//          1580						Error message
//          1584						Yes
//          1684						Yes
//          1900						No
//          2000                        Yes
//          3000                        No
//          1989						No
//          1999						No
//          1763						No
//********************************************************
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Calendar
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        char result = 'Y';
        String temp;

        while(result == 'Y')
        {
            System.out.println("Enter a year: ");

            int year = scan.nextInt();
            if (year<1582)
            {
                System.out.println("Too low of a year, please enter a higher year.");
            }
            else
            {
                if (year%4 ==0)
                {
                    if (year%100==0)
                    {
                        if (year%400 ==0)
                        {
                            System.out.println("The year "+year+" is a leap year.");
                        }
                        else
                        {
                            System.out.println("No, "+year+" is not a leap year.");
                        }
                    }
                    else
                    {
                        System.out.println("The year "+year+" is a leap year.");
                    }
                }
                else
                {
                    System.out.println("No, "+year+" is not a leap year.");
                }
            }
            System.out.println("Would you like to enter another year? Yes or No?");
            temp = scan.next();
          //  temp = temp.toUpperCase(); Creating Bug
            result = temp.charAt(0);
        }

    }
}
