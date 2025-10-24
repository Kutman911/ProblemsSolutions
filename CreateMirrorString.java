import java.util.Scanner;
public class CreateMirrorString{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputLine = sc.nextLine();
    String resultString = inputLine + mirrorString(inputLine, inputLine.length() - 1);
    System.out.println(resultString);
    sc.close();
  }
  public static String mirrorString(String input, int index){
    if(index<0){
      return "";
    }
    char currentChar = input.charAt(index);
    char  reverseChar;
    if(currentChar == '('){
      reverseChar = ')';
    }
    else{
      reverseChar = currentChar;
    }
    return String.valueOf(reverseChar) + mirrorString(input, index - 1);
  }
}
