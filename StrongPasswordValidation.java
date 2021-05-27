import java.util.*;
import java.util.regex.Pattern;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    System.out.println(Pattern.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$-+_^])(?=\\S+$).{8,20}",word));
  }
}
