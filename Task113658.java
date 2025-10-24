import java.util.Scanner;
public class Task113658{
  public static void  main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    StringBuilder container = new StringBuilder();
    reduceEqualLetters(container, input, 0, input.length() - 1);
    System.out.println(container);

  }
  public static void reduceEqualLetters(StringBuilder container, String input, int start, int end){
    char symbolFirst = input.charAt(start);
    char symbolLast = input.charAt(end);
    if(start == input.length() / 2){return;}
    if(symbolFirst != symbolLast){container.append(symbolFirst);}
    reduceEqualLetters(container, input, ++start, --end);
    if(symbolFirst != symbolLast){container.append(symbolLast);}
  }
}
