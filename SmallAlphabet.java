import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    char c = scanner.next().charAt(0);
    boolean b = true;
    if(c == 'a' || c == 'z')
      b = false;
    System.out.println(b);
  }
}