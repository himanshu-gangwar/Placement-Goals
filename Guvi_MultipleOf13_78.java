import java.io.*;

class Guvi_MultipleOf13_78
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no;
	
		System.out.println("Enter the number");
		no=Integer.parseInt(in.readLine());
		
		if(no%13==0)
			System.out.println("Yes");
		else
			System.out.println("No");
			
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
