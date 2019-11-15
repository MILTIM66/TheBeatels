/*
Name: The Beatels
Purpose: to using arrays
Author: Tanner Kennedy
Date: 11/13/19
*/

public class TheBeatles 
{
    public static void main(String[] args)
    {
	final String [] theBeatles = new String [4];
	theBeatles [0] = "John Lennon";
	theBeatles [1] = "Paul McCartney";
	theBeatles [2] = "George Harrison";
	theBeatles [3] = "Ringo Starr";
	
	
	// LEAVE THE REST OF THE PROGRAM ALONE
	// This will print out your array.
	System.out.println("The Beatles are:");
	for (int index = 0; index < theBeatles.length; index++)
	{
	    System.out.println(theBeatles[index]);
	}
    }
}
