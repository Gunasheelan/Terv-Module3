import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    TreeSet<String> set = new TreeSet<>();
    for(int i = 0; i < size; i++)
    {
      String s = scanner.next();
      set.add(s);
    }
    for(String s : set)
    {
      System.out.println(s);
    }
  }
}