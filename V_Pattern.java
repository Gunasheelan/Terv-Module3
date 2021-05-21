import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for(int i = 0; i < num; i++)
    {
      for(int j = 0; j < num*num - 1; j++)
      {
        if(i == j || i + j == num+num - 2)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}