import java.io.*;
import java.util.*;
class Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,a,b;
System.out.println("Enter the first value");
a=sc.nextInt();
System.out.println("Enter the second value");
b=sc.nextInt();
if((a<=100000)&&(b<=100000))
{
for(i=a;i<=b-1;i++)
{
if((i+1)%2==1)
{
System.out.println(i+1);
}
}}
  else
  {
    System.out.println("Check the number");
}
}
}


