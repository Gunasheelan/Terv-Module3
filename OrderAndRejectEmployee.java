import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      TreeSet<String> set = new TreeSet<>();
      String temp = "";
      for(int i = 1; i <= 4; i++){
        String s = scanner.next();
        set.add(s);
        if(i == 2)
        {
          temp = s;
        }
      }
        System.out.println(set);
        set.remove(temp);
        System.out.println(set);
	}
}