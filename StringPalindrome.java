import java.util.*;
public class Main
{
  public static void main(String[] main){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    String array[] = new String[size];
    int count = 0;
    for(int i = 0; i < size; i++){
      array[i] = scanner.next();
    }
     for(int i = 0; i < array.length; i++){
      String s = array[i];
      String temp = "";
      for(int j = s.length() - 1; j >= 0; j--)
      {
        temp += s.charAt(j);
      }
      if(temp.equals(s)){
        count++;
      }
    System.out.println(count);
  }
}