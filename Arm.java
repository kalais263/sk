import java.util.Scanner;
public class Arm 
{ 
public static void main(String[] args)
 {
int num, number, temp, total = 0;
 System.out.println("Enter the  Number");
Scanner scanner = new Scanner(System.in);
num = scanner.nextInt();
scanner.close();
number = num;
 for( ;number!=0;number /= 10)
 {
temp = number % 10;
total = total + temp*temp*temp;
}
if(total == num)
 System.out.println("Yes");
 else
 System.out.println("No");
    }
}
