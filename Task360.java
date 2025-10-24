import java.util.Scanner;
public class Task360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsNum = scanner.nextInt();
        int columnsNum = scanner.nextInt();
        int[][] resultsMatrix = new int[rowsNum][columnsNum];
        int bestResult = 0;

        for (int i = 0; i < rowsNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
                resultsMatrix[i][j] = scanner.nextInt();
            if (resultsMatrix[i][j] > bestResult) {
                bestResult = resultsMatrix[i][j];
            }
          }
        }

        int bestAthletesNum = 0;
        for (int i = 0; i < rowsNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
            if (resultsMatrix[i][j] == bestResult) {
                bestAthletesNum++;
                break;
            }
          }
        }
        int[] bestAthletesIndex = new int[bestAthletesNum];
        int arrayIndex = 0;
        for (int i = 0; i < rowsNum; i++) {
            for (int j = 0; j < columnsNum; j++) {
            if (resultsMatrix[i][j] == bestResult) {
                bestAthletesIndex[arrayIndex] = i;
                arrayIndex++;
                break;
            }
          }
        }
        System.out.println(bestAthletesIndex.length);
        for (int i = 0; i < bestAthletesIndex.length; i++) {
            System.out.print(bestAthletesIndex[i] + " ");
        }
  }
}
