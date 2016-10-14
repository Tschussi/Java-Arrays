
public class lab3C {

	public static void main(String[] args) {
		boolean[] anArray = new boolean[100];
		for(int i =0;i<anArray.length;i++) 
			{
			if(i%2==0)
				anArray[i]=true;
			else
				anArray[i]=false;
			System.out.println(anArray[i]);
			}	
		}

	}
