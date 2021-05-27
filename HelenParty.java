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
    int key = scanner.nextInt();
    if(list.contains(key)){
     	list.remove(list.indexOf(key));
    	for(int i : list){
      		System.out.println(i);
    	 }
    }
    else{
      System.out.println("Oops! id is not there");
    }
  }
}