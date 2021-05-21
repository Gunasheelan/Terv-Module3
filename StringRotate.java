import java.util.*;
public class Main{
  public static void main(String[] arsg){
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    String temp = "";
    System.out.println(word);
    for(int i = 0; i < word.length() - 1; i++)
    {
      char c = word.charAt(0);
      temp = word.substring(1, word.length()) + c;
      System.out.println(temp);
      word = temp;
    }
  }
}