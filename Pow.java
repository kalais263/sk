import java.io.*;
import java.util.*;
class Pow
{
public static void main(String args[])
{
int i,d=1,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
a=sc.nextInt();
System.out.println("Enter the power of the number");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
d=d*a;
}
System.out.println("The value is:"+d);
}
}


