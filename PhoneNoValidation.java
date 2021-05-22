import java.util.*;
import java.util.regex.Pattern;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String a = scanner.next();
    System.out.println(Pattern.matches("[6-9]{1}[0-9]{9}", a));
  }
}