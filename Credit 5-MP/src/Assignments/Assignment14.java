/*

Program: Assignment14.java          Date: April 27, 2022


Author: Manav Pandya 
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment14 
{

	public static void main(String[] args) 
	{ //Ask for age to verify your stage of life
        Scanner userinput = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = userinput.nextInt();
        //if else statements to determine what stage of life you belong due to your age
        if (age < 5)
        {
        System.out.println("You are a toddler");
        }
       
        else if ((age < 10)&&(age > 6))               
        {
        System.out.println("You are a child");
        }
        
        else if ((age < 12)&&(age > 10))
        {
        System.out.println("You are a preteen");
        }
       
        else if ((age < 17)&&(age > 12))
        {
        System.out.println("You are a teen");
        }
       
        else
        {
        System.out.println("You are an adult");
        }
		

	}

}
/* Screen Dump

Please enter your age: 
19
You are an adult
 
 */