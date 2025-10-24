import java.util.Scanner;
public class Task1459{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    StringBuilder romanFormat = new StringBuilder();
    toRoman(romanFormat, num);
    System.out.print(romanFormat);
  }
  public static void toRoman(StringBuilder romanFormat, int num){
    int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"С", "XC","L","XL","X","IX","V","IV","I"};
    for(int i = 0; i < values.length; i++){
      while(num>=values[i]){
        romanFormat.append(symbols[i]);
        num -= values[i];
      }
    }
    return;
  }
}
