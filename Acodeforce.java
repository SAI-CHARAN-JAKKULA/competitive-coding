
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ARequiredRemainder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		for(int z=0;z<v;z++)
		{
		    long x=sc.nextLong();
		    long y=sc.nextLong();
		    long n=sc.nextLong();
		    long out=0;
		    long a=n/x;
		   if(n%x<y)
			out=a-1;
		else
			out=a;
		    System.out.println((out*x+y));
		}
	}
}