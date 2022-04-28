/*

Program: Assignment17.java          Date: April 28, 2022


Author: Manav Pandya 
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment17 
{

	public static void main(String[] args) 
	{  Scanner userinput = new Scanner(System.in);
  	 
   	System.out.println("Please enter your GPA or type -1 to exit the program: ");
 	 
   	double gpa1 = userinput.nextDouble();
   	 
   	while (gpa1 != -1)
  	 
       	{    
       	if ((gpa1 > 4)||(gpa1 < -1)||((gpa1 > -1)&&(gpa1 < 0)))
       	{
        	System.out.println("This GPA doesn't exist.");
        	System.out.println("Enter another gpa, or type -1 to leave:");
        	gpa1 = userinput.nextDouble();
       	}
       	else if  ((gpa1 >= 3.8)&&(gpa1 < 4.01))
       	{
        	System.out.println("summa cum laude");
        	System.out.println("Enter another gpa, or type -1 to leave:");
        	gpa1 = userinput.nextDouble();
       	}     	 
  	 
       	else if ((gpa1 < 3.8)&&(gpa1 > 3.64))
       	{
        	System.out.println("magna cum laude");
        	System.out.println("Enter another gpa, or type -1 to leave:");
        	gpa1 = userinput.nextDouble();
       	}
  	 
       	else if ((gpa1 < 3.65)&&(gpa1 > 3.4))
       	{
        	System.out.println("cum laude");
        	System.out.println("Enter another gpa, or type -1 to leave:");
        	gpa1 = userinput.nextDouble();
       	}
  	 
       	else  
       	{
        	System.out.println("Sorry, at this you did not qualify for an honors distinction.");
        	System.out.println("Enter another gpa, or type -1 to leave:");
        	gpa1 = userinput.nextDouble();
       	}
  	 
             	 
       	}
  	 
        	System.out.println("Thank you for using our program, have a great day!");
        	 
	
 
		

	}

}

/* Screen Dump

Please enter your GPA or type -1 to exit the program: 
3.6
cum laude
Enter another gpa, or type -1 to leave:
3.2
Sorry, at this you did not qualify for an honors distinction.
Enter another gpa, or type -1 to leave:
3.9
summa cum laude
Enter another gpa, or type -1 to leave:
-1
Thank you for using our program, have a great day!

 
 */