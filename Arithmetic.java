import java.io.*;
import java.net.*;
import java.util.*;
class Arithmetic
{
public static void main(String[] args)
{
int f=0,f1=0,f2=1,i;
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println(""+f);
for(i=0;i<n-1;i++)
{
f=f1+f2;
f2=f1;
f1=f;
System.out.println(""+f);
}
}
}
