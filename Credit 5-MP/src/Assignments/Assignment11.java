/*

Program: Assignment11.java          Date: April 26, 2022


Author: Manav Pandya 
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment11 
{
	
	public static void main(String[] args)
	{ Scanner userinput = new Scanner(System.in);
    System.out.println("Please enter any three digit number: ");
    int Number = userinput.nextInt();
    int first = (Number / 100);
    int second = (Number / 10) % 10;
    int third = (Number % 10);
    int max = 0;
    int min = 0;
    if((first < second)&&(third > second)&&(first < third))
    {
        max = third;  
        min = first;  
    }
    else if((first > second)&&(third < second)&&(first < third))
    {
        max = first;
        min = third;
    }
    else if ((first > second)&&(third > second)&&(first < third))
    {
        max = third;
        min = second;
    }
    else if ((first < second)&&(third < second)&&(first > third))
    {
        max = second;
        min = third;
    }
    else if ((first < second)&&(third < second)&&(first < third))
    {
        max = second;
        min = first;
    }
    else if ((first > second)&&(third < second)&&(first > third))
    {
        max = first;
        min = second;
    }
    System.out.println("The greatest number is: " +max+ "");
    System.out.println("The smallest number is: " +min+ "");
    int Sum = (first + second + third);
    System.out.println("The sum of the 3 digits is: " +Sum+ "");
    int Product = (first * second * third);
    System.out.println("The product of the 3 digits is: " +Product+ "");
    int Average = (Sum / 3);
    System.out.println("The average of the 3 digits is: " +Average+ "");
		

	}

}
/* Screen Dump

Please enter any three digit number: 
569
The greatest number is: 9
The smallest number is: 5
The sum of the 3 digits is: 20
The product of the 3 digits is: 270
The average of the 3 digits is: 6

 
 */