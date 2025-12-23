import java.util.Scanner;
class Task113652 {
  static int N;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();

    visited = new boolean[N + 1];

    if (canGet(1)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  static boolean[] visited;

  static boolean canGet(int current) {
    if (current == N) {
      return true;
    }

    if (current > N || visited[current]) {
      return false;
    }
    visited[current] = true;
    return canGet(current + 3) || canGet(current + 5);
  }
}
