import java.util.Scanner;
public class FindMaxNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int maxNumber = Integer.MIN_VALUE;
    if(maxNumber<num1){maxNumber=num1;}
    if(maxNumber<num2){maxNumber=num2;}
    if(maxNumber<num3){maxNumber=num3;}
    System.out.println(maxNumber);
  }
}
