/*

Program: FinalProject.java          Date: May 1, 2022


Author: Manav Pandya 
School: CHHS
Course: Computer Science 10
 
*/
package FinalProject;

import java.util.Scanner;

public class FinalProject 
{

	public static void main(String[] args) 
	{ double firstmark; 
	  double secondmark; 
	  double thirdmark; 
	  double fourthmark; 
	  double fifthmark; 
	  double averagemark;
	  double remainingpercent; 
	  Scanner scan=new Scanner( System.in );
	  System.out.println("Enter the first mark:");
	  firstmark=scan.nextDouble();
	  System.out.println("Enter the second mark:");
	  secondmark=scan.nextDouble();
	  System.out.println("Enter the third mark:");
	  thirdmark=scan.nextDouble();  
	  System.out.println("Enter the fourth mark:");
	  fourthmark=scan.nextDouble();    
	  System.out.println("Enter the fifth mark:");
	  fifthmark=scan.nextDouble();   
	  averagemark=(firstmark + secondmark + thirdmark + fourthmark + fifthmark)/5;
	  System.out.println("The average is:" + averagemark + "%");
	  if(averagemark < 50 )
	  {
	   System.out.println("Fail");
	   remainingpercent= 50-averagemark;
	   System.out.println("you need this much % to obtain a passing mark: " + remainingpercent);
	  }
	  else if(averagemark > 49.9 && averagemark < 90 )
	  {
	   System.out.println("Pass"); 
	   remainingpercent= 90-averagemark;
	   System.out.println("you need this much % to recieve an honours distinction: " + remainingpercent);
	  }
	  else 
	  {
		  System.out.println("Pass"); 
		  System.out.println("Congratulations, you have obtained a high enough grade to receive an honours distinction"); 
	  }
		  
		  

	}

}
