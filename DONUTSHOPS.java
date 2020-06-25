//https://codeforces.com/contest/1373/problem/A
//june25
import java.util.*;
import java.io.*;
public class Charan{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long x1=-1,x2=-1;
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		if (a==c){
			x1=-1;
			x2=b;
		}
		if(a>c){
			x1=-1;
			x2=b;

		}
		if(a<c)
		{
			x1=1;
			if((b*a)>c){
				x2=b;
			}

		}
			System.out.println(x1);
			System.out.println(x2);



		}

				
		
	}
			}