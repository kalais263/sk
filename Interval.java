import java.io.*;
import java.util.*;
public class Interval
 {
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
while (a < b) {
 boolean flag = false;
 a++;
 for(int i = 2; i <= a/2; ++i) {
 if(a % i == 0)
 {
    flag = true;
      break;
 }
  }
if (!flag)
 System.out.print(a + " ");
 ++a;
        }
    }
}
