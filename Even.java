import java.io.*;

import java.util.*;

class Even

{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

int i,a,b;

System.out.println("Enter the first value");

a=sc.nextInt();

System.out.println("Enter the second value");

b=sc.nextInt();

for(i=a;i<b-1;i++)

{

if((i+1)%2==0)

{

System.out.println(i+1);

}
}
  

}
}
