<<<<<<< HEAD
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();  
    try{
      if(num >= 18)
        System.out.println("Access granted");
      else
        System.out.println(num/0);
      
    }
    catch(ArithmeticException e){
      System.out.println("java.lang.ArithmeticException: Access denied");
    }
  }
=======
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();  
    try{
      if(num >= 18)
        System.out.println("Access granted");
      else
        System.out.println(num/0);
      
    }
    catch(ArithmeticException e){
      System.out.println("java.lang.ArithmeticException: Access denied");
    }
  }
>>>>>>> 60ee62249338b6f8d0160ff6629a792af6f91347
}