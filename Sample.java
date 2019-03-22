import java.util.Scanner;
class Sample
{
public static void main(String args[])
{
int num1,num2;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
num1=num1^num2;
num2=num1^num2;
num1=num1^num2;
sc.close();
System.out.println(num1);
System.out.println(num2);
}
}
