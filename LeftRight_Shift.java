import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println("a<<2 = "+ (a<<2));
    System.out.println("b>>2 = " + (b>>2));
    System.out.println("b>>>2 = " + (b >>>2));
  }
}