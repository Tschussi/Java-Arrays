import java.util.Scanner;
import java.io.*;

public class lab3G {
	  
	public static void main (String[] args) throws IOException
	   {
		  Scanner in = new Scanner(new File("lab3data.txt"));
		  int r = in.nextInt();
		  int c = in.nextInt();
		  int avg = 0;
		  int avgTotal = 0;
	      int[][] table = new int[r][c];

	      // Load the table with values
	      for (int row=0; row < table.length; row++)
	         for (int col=0; col < table[row].length; col++)
	            table[row][col] = in.nextInt();

	      // Print the table
	      for (int row=0; row < table.length; row++)
	      {
	    	  avgTotal += avg;
	    	  avg = 0;
	    	 if(row==0)
	    	 {	 
	    		 System.out.println("# |	0	1	2	3	4	5	6	7	8	9	avg");
	    	 	 System.out.println("--+------------------------------------------------------------------------------------------");
	    	 } 
	    	 for (int col=0; col < table[row].length; col++)
	         {	 
	    		 avg += table[row][col];
	    		 if(col==0)
	    			 System.out.print("" + row + " |\t" + table[row][col] );
	    		 else if (col<c-1)
	    			 System.out.print("\t" + table[row][col]);
	    		 else {
	    			 System.out.print("\t" + table[row][col]);
	    			 System.out.print("\t" + avg/c);
	    		 }
	         }
	         System.out.println();
	      }
	      System.out.println("The average value in the table is: " + avgTotal/(r*c));
	      in.close();
	   }
}