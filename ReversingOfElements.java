import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < size; i++){
      int a = scanner.nextInt();
      list.add(a);
    }
    System.out.println("Before Reversing : "+list);
    Collections.reverse(list);
    System.out.println("After Reversing : "+list);
  }
}   