//https://codeforces.com/contest/1373/problem/B
//june25
import java.util.*;
import java.io.*;
public class Charan{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String str=sc.next();
			int count=0;
			while(str.contains("10")||str.contains("01")){
				int x=0;
				if(str.contains("01")){
				x=str.indexOf("01");

				}
				else{
				 x=str.indexOf("1");

				}


	if((x+2)<str.length())
	{
		 
	 str=str.substring(0,x)+str.substring(x+2,str.length());
	}
	else{
		str=str.substring(0,x);

	}
			count++;

			}
			if(count%2==0){
				System.out.println("NET");
			}
			else{
				System.out.println("DA");


			}


		}

				
		
	}
			}
