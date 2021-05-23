import java.util.*;
import java.util.regex.Pattern;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int key = scanner.nextInt();
    int array[] = new int[size];
    for(int i = 0; i < size; i++)
    {
      array[i] = scanner.nextInt();
    }
    int count = 0;
    for(int i = 0; i < array.length; i++){
      for(int j = i; j < array.length; j++)
      {
        if(Math.abs(array[i] - array[j]) == key)
          count++;
      }
    }
    System.out.println(count);
  }
}