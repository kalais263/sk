import java.io.*;

import java.util.*;
 
class Pal

{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

int n,rev=0,rem,org;

System.out.println("Enter the value");

n=sc.nextInt();

org=n;

if(n<=1000)

{

while(n!=0)
{
rem=n%10;

rev=rev*10+rem;

n=n/10;
}

if(org==rev)

{

System.out.println(org+ "is palindrome");

}

else

{

System.out.println(org +"is not palindrome");

}
}

else
{
System.out.println("Greater than 1000");
}
}
}
