import java.util.Scanner;
public class Task1458 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
            matrix[i][j] = scanner.nextInt();
          }
        }
        int[][] turnedMatrix = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
          int indexRows = rows - 1;
          for (int j = 0; j < rows; j++) {
              turnedMatrix[i][j] = matrix[indexRows][i];
              indexRows--;
          }
        }
        System.out.println(columns + " " + rows);
        for (int i = 0; i < columns; i++) {
          for (int j = 0; j < rows; j++) {
              System.out.print(turnedMatrix[i][j] + " ");
          }
          System.out.println();
        }


    }
}
