import java.io.*;
public class Main{
  public static void main(String[] args) throws Exception{
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);
    char c = (char)br.read();
    if(Character.isLowerCase(c))
      System.out.println("Lower Case");
    else if(Character.isUpperCase(c))
      System.out.println("Upper Case");
    else
      System.out.println("Digit");
  }
}