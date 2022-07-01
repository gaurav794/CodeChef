/* package codechef; // don't place package name! */
package CodeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Fitness
{
    public int numOfKmTravelled(int distance)
    {
        int numOfWalks = 2, numOfDaysOfficeIsOpen = 5;

        return (numOfWalks*distance*numOfDaysOfficeIsOpen);
    }
}


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Fitness chef = new Fitness();
        Scanner input = new Scanner(System.in);
        int numOfTestCases = input.nextInt();
        for(int i=0;i<numOfTestCases;i++)
        {
            System.out.println(chef.numOfKmTravelled(input.nextInt()));
        }
        input.close();		
	}
}
