import java.util.*;
import java.util.regex.Pattern;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    System.out.println(Pattern.matches("[a-cx-z]",a));
  }
}