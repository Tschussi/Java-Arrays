//********************************************************************
//  TwoDArray.java
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************
public class lab3F {

   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[][] table = new int[3][4];

      // Load the table with values
      for (int row=0; row < table.length; row++)
         for (int col=0; col < table[row].length; col++)
            table[row][col] = row * 10 + col;

      // Print the table
      for (int row=0; row < table.length; row++)
      {
    	 if(row==0)
    	 {	 
    		 System.out.println("# |	0	1	2	3");
    	 	 System.out.println("--+---------------------------------");
    	 } 
    	 for (int col=0; col < table[row].length; col++)
         {	 
    		 if(col==0)
    			 System.out.print("" + row + " |\t" + table[row][col] );
    		 else
    			 System.out.print("\t" + table[row][col]);
         }
         System.out.println();
      }
   }
} 