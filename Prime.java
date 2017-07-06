# re5
import java.io.*;
import java.util.*;
public class Prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i,a,count=0;
    System.out.println("Enter a number");
    a=sc.nextInt();
    for(i=2;i<a;i++)
    if(a%i==0)
    {
      count++;
      {
        break;
        }
        }
      if(count==0)
    {
      System.out.println("prime number");
    }  
    else
      {
      System.out.println("not prime number");
  }
     }
     
  }
