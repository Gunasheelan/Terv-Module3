import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    String array[] = new String[size];
    for(int i = 0; i < size; i++){
      array[i] = scanner.next();
    }
    Arrays.sort(array, Collections.reverseOrder());
    for(String s : array){
      System.out.println(s);
    }
  }
}