import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int num2 = scanner.nextInt();
    int sq = (int)Math.pow(num, num2);
    System.out.println((float)sq);
    System.out.println(sq);
    int result = 0;
    while(sq != 0){
      result = result * 10 + sq % 10;
      sq = sq / 10;
    }
    System.out.println(result);
  }
}