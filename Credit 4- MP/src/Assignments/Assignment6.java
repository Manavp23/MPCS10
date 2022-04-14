/*

Program: Assignment6.java          Date: April 13, 2022


Author: Manav Pandya 
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment6 
{

	public static void main(String[] args) 
	{ Scanner userinput = new Scanner(System.in);
    System.out.println("What is your first name? ");
    String name = userinput.nextLine();
    
   System.out.println("What is your last name? ");
    String name2 = userinput.nextLine();
    
   System.out.println("What grade are you in? ");
    String Grade = userinput.nextLine();
    
   System.out.println("What school do you attend? ");
    String Schoolname = userinput.nextLine();
    
   System.out.println("What is your favourite hobby? ");
    String hobby = userinput.nextLine();
    
   System.out.println("Hello, your name is " +name+ " " +name2+ ", you are "
            + "currently in grade " +Grade+ " at " +Schoolname+ ". Your "
                    + "favourite hobby is " +hobby+ ".");
		

	}

}
/* Screen Dump

Hello, your name is Manav Pandya, you are currently in grade 11 at Crescent 
Heights. Your favourite hobby is Hockey.

 
 */