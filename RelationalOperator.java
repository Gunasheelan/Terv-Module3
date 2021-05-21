import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if((a > 8 && b > 8) && (a > 10 || b > 10))
    {
      System.out.println("Both x and y are greater than 8");
      System.out.println("Either x and y are greater than 10");
    }
    else if(a > 8 && b > 8)
    {
      System.out.println("Both x and y are greater than 8");
    }
    else if(a > 10 || b > 10)
    {
      System.out.println("Either x and y are greater than 10");
    }
  }
}