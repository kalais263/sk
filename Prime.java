import java.io.*;
import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i,flag=0;
System.out.println("Enter the value");
a=sc.nextInt();
for(i=2;i<=a/2;++i)
{
if(a%i==0)
{
flag=1;
break;
}
}
if(a==1)
{
System.out.println("1 is neither prime nor a composite");
}
else
{
if(flag==0)
System.out.println("yes");
else
System.out.println("No");
}
}
}
