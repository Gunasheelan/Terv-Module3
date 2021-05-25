import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    TreeSet<Integer> set = new TreeSet<>();
    for(int i = 0; i < 4; i++)
    {
      int in = scanner.nextInt();
      set.add(in);
    }
    System.out.println(set.first());
    System.out.println(set.last());
  }
}