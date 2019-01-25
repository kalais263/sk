import java.util.Scanner;
 class Multiple
{
  public static void main(String args[])
  {
    int n, c;
    System.out.println("Enter the value");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
 for (c = 1; c <= 5; c++)
      System.out.println(n*c);
  }
}
