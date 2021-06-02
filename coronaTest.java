import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    String array[] = {"fever","drycough","lossofsmell","sorethroat"};
    int count = 0;
    String viral = "fever headache tiredness";
    if(word.contains(viral)){
      System.out.println("Viral Fever");
    }
    else{
      for(int i = 0; i < array.length; i++)
      {
        if(word.contains(array[i]))
        {
          count++;
        }
      }
      if(count > 0)
        System.out.println("Symptoms of Corona. Take the test");
      else
        System.out.println("No Test");
    }
  }
}