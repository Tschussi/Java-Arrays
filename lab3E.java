import java.util.Scanner;

public class lab3E
{
    public static void main(String[] args)
    {
    	int[] anArray;  // declares an array of integers
        anArray = new int[5];  // allocates memory for 5 integers
        Scanner in = new Scanner(System.in);
        
        for(int k=0; k<anArray.length;k++)
        	{
        	System.out.println("Please enter an integer: ");
        	anArray[k] = in.nextInt();
        	}
        for(int i=0; i<anArray.length; i++)	
        	System.out.println("Element at index " + i + ": " + anArray[i]);
        in.close();
    }
}