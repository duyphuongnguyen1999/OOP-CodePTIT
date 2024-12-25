import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống sau khi nhập n
            for (int i = 0; i < n; i++) {
                String name = sc.nextLine().trim();
                System.out.println(nameStandardization(name).trim());
            }
        }
    }

    private static String nameStandardization(String name) {
        String[] tokens = name.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String token : tokens) {
            String capitalizeToken = token.substring(0, 1).toUpperCase() + token.substring(1).toLowerCase();
            result.append(capitalizeToken).append(" ");
        }
        return result.toString().trim();
    }
}
