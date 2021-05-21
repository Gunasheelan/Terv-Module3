import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int cube = num*num*num;
    System.out.println((float)cube);
    System.out.println(cube);
    int result = 0;
    while(cube != 0){
      result = result * 10 + cube % 10;
      cube = cube / 10;
    }
    System.out.println(result);
  }
}