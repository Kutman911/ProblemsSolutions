import java.util.Scanner;
public class Task1421 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    StringBuilder convertedLine = new StringBuilder();
    convertedLine.append(line.charAt(0));
    char preSymbol = 0;
    char symbol = 0;
    for (int i = 1; i < line.length(); i++) {
      preSymbol = line.charAt(i - 1);
      symbol = line.charAt(i);
      if ((preSymbol != ' ' & symbol != ' ') || (preSymbol == ' ' & symbol != ' ') || (preSymbol != ' ' & symbol == ' ')) {
        convertedLine.append(symbol);
      }
    }
    System.out.println(convertedLine);
    }
}
