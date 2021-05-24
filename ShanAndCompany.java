import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int key = scanner.nextInt();
    int array[] = new int[size];
    for(int i = 0; i < size; i++){
      array[i] = scanner.nextInt();
    }
    int count = 0;
    for(int i = 0; i < array.length; i++)
    {
      if(key == array[i])
        count++;
    }
    if(count > 0)
      System.out.println(key+" was found in the list");
    else
      System.out.println(key+" was not found in the list");
  }
}