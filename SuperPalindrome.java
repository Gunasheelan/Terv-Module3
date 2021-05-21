import java.util.*;
public class Main{
  public static void main(String[] main){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int numcopy = num;
    int square = num*num;
    int sqcopy = square;
    int result = 0;
    while(num != 0)
    {
      result = result*10 + num % 10;
      num = num / 10;
    }
    int result2 = 0;
    while(square != 0)
    {
      result2 = result2 * 10 + square % 10;
      square = square / 10;
    }
    if(numcopy == result && sqcopy == result2){
      System.out.println("Yes it is a super palindrome and palindrome");
    }
    else if(numcopy == result)
    {
      System.out.println("No it is not a super palindrome but it is  palindrome"); 
    }
    else{
      System.out.println("No it is not a palindrome");
    }
  }
}