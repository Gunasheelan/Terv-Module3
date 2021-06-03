import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int square = 0;
      int remainder = 0, result = 0;
      if(num % 2 == 0){      
        num = num / 2;
        square = num * num;
        while(square != 0){
          remainder = square % 10;
          result = result * 10 + remainder;
          square /= 10;
        }
        System.out.println(result);
      }
      else{
        System.out.println((num / 2) + 1);
      }

	}
}
