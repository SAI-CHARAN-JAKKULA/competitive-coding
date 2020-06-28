import java.util.*;
public class MD{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
      ArrayList<Integer> a=new ArrayList<Integer>();
    for(int i=0;i<t;i++)
    {
      int x=sc.nextInt();
      if(x==2)
      {
        a.add(-1);
        continue;
      }
      if(x==1)
      {
        a.add(0);
        continue;
      }
        int mov=0,flag=0;
      while(true)
      {
        if(x%6==0)
        {
          x=x/6;
          mov++;
          continue;
        }
        if(x%3==0)
        {
          x=x*2;
          mov++;
        }
        else
        {
          flag=1;
          break;
        }
      }
      if(flag==1 && x==1)
        a.add(mov);
      else
        a.add(-1);
      
    }
  
      
        
      
    
    for(int j=0;j<a.size();j++)
    {
      System.out.println(a.get(j));
    }
  }
}