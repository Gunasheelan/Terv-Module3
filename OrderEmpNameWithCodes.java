import java.util.*;
public class Main
{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    TreeMap<Integer, String> map = new TreeMap<>();
    for(int i = 0; i < 4; i++)
    {
      Integer in = scanner.nextInt();
      String s = scanner.next();
      map.put(in, s);
    }
    for(Map.Entry m : map.entrySet())
    {
      System.out.println(m.getKey()+ " "+ m.getValue());
    }
   }
}