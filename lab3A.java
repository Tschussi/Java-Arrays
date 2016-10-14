
class lab3A
{
    public static void main(String[] args)
    {
        int[] anArray;  // declares an array of integers

        anArray = new int[5];  // allocates memory for 5 integers

        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // etc.
        anArray[3] = 400;
        anArray[4] = 500;

        for(int i=0; i<anArray.length; i++)	
        	System.out.println("Element at index " + i + ": " + anArray[i]);
    }
}