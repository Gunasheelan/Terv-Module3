import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < size; i++){
      int in = scanner.nextInt();
      list.add(in);
    }
    System.out.println("list of prime numbers : "+list);
    ArrayList<Integer> list2 = new ArrayList<>();
    for(int i = 0; i < list.size(); i++){
      if(! list2.contains(list.get(i))){
        list2.add(list.get(i));
      }
    }
    System.out.println("list of primes without duplicates : "+list2);
  }
}