/*

Program: Assignment10.java          Date: April 26, 2022


Author: Manav Pandya 
School: CHHS
Course: Computer Science 10
 
*/
package Assignments;

import java.util.Scanner;

public class Assignment10 
{

	public static void main(String[] args) 
	{  Scanner userinput = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int digit = userinput.nextInt();
    if (digit % 2 == 0) {
    System.out.println("The integer " +digit+ " is even");
                } else {
        System.out.println("The integer " +digit+ " is odd");
		
                }
	}

}
/* Screen Dump

Enter an integer: 
28
The integer 28 is even.

Enter an integer:
2049
The integer 2049 is odd.

Enter an integer:
-236
The integer -236 is even.
 */