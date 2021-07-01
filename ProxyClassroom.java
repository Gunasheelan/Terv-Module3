import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int array[] = new int[size];
    for(int i = 0; i < size; i++){
      array[i] = scanner.nextInt();
    }
    int count = 0;
    for(int i = 1; i <= array.length; i++){
      for(int j = 0; j < array.length; j++){
        if(i == array[j]){
          count++;
        }
      }
      if(count == 0){
        System.out.println(i);
      }
      count = 0;
    }
  }
}