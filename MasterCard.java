import java.util.regex.Pattern;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    System.out.println(Pattern.matches("[5]{1}[0-9]{3}" + "\\s" + "[0-9]{4}" + "\\s" + "[0-9]{4}" + "\\s" + "[0-9]{4}", word));
  }
}