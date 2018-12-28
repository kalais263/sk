import java.io.*;
import java.util.*;
class Inter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
while(a<b)
{
int flag=0;
for(int i=0;i<=a/2;++i)
{
if(a%i==0)
{
flag=1;
break;
}}
if(flag==0)
{
System.out.println(a);
++a;
}}}}
