import java.util.Scanner;
public class Task1435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine();
        boolean isIpAddress = true;
        int countDots = 0;
        for (int i = 0; i < ipAddress.length(); i++) {
            if (ipAddress.charAt(i) == '.') {
                countDots++;
            }
            if (ipAddress.charAt(i) == '.' && ipAddress.charAt(i - 1) == '.') {
                isIpAddress = false;
                break;
            }
        }
        if (isIpAddress) {
            String[] parts = ipAddress.split("\\.", -1);
            if (parts.length != 4) {
            isIpAddress = false;
        }

            for (String part : parts) {
                int octet = Integer.parseInt(part);
                if (octet < 0 || octet > 255) {
                    isIpAddress = false;
                    break;
                }
            }
        }
      if (ipAddress.charAt(0) == '.'|| ipAddress.charAt(ipAddress.length() - 1) == '.') {
        isIpAddress = false;
      }
        if (countDots == 3 && isIpAddress) {
          System.out.print(1);
        } else {
          System.out.print(0);
        }

    }
}
