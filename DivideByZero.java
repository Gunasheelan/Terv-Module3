import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    try{
      System.out.println(2/0);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    finally
    {
      System.out.println("rest of the code...");
    }
  }
}