import java.util.*;
import java.util.regex.Pattern;
public class Main
{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    System.out.println(Pattern.matches("[a-zA-Z0-9]+", word));
  }
}