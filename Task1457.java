import java.util.Scanner;
public class Task1457 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int pointA = sc.nextInt();
    int pointB = sc.nextInt();
    int pointC = sc.nextInt();
    int pointD = sc.nextInt();
    int[] array = new int[length];
    for(int i = 0; i < length; i++) {
      array[i] = i + 1;
    }
    placeArrayElements(array, pointA, pointB, pointC, pointD);
    for(int i = 0; i < length; i++) {
      System.out.print(array[i] + " ");
    }
  }
  public static void placeArrayElements(int[] array, int pointA ,int pointB, int pointC, int pointD) {
    int temp = pointB;
    for(int i = pointA; i <=pointB; i++) {
      array[i - 1] = temp;
      temp--;
    }
    int index = pointD - 1;
    int[] copy = new int[array.length];
    for(int i = 0; i < array.length; i++) {
      copy[i] = array[i];
    }
    for(int i = pointC; i <= pointD; i++) {
      array[i - 1] = copy[index];
      index--;
    }
  }
}
