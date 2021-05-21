import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();  
    if(num < 18)
    {
      System.out.println("java.lang.ArithmeticException: Access denied");
    }
    else
      System.out.println("Access granted");
  }
}