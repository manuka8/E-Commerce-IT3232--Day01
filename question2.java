import java.util.Scanner;

public class question2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            int m = n / 2;
            if (i <= m) {
                System.out.print((m - i + 1) + " ");  
            } else {
                System.out.print((n - (i - m) + 1) + " "); 
            }
        }
    }
}
