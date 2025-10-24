import java.util.Scanner;
public class InsertAsterics{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String inputLine = sc.nextLine();
    if (inputLine.length() <= 1) {
            System.out.println(inputLine);
            return;
        }
    String resultString = InsertAstericsRecursive(inputLine, 0);
    System.out.println(resultString);
    sc.close();

  }
  public static String InsertAstericsRecursive(String input, int index){
    if(index == input.length() - 1){
      return String.valueOf(input.charAt(index));
    }

    char currentChar = input.charAt(index);
    String result = currentChar + "*" + InsertAstericsRecursive(input, ++index);
    return result;
  }
}
