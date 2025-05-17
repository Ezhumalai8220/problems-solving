import java.util.*;

public class checktheprimenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n > 2) {
            System.out.println("the given number is:" + n + "is  not prime");
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;
            if (n % i == 0) {
                count += 1;
            }
            if (count < 2) {
                System.out.println("the given number is:" + n + "is not prime");
            } else {
                System.out.println("the given number is:" + n + "is prime");
            }

        }
    }

}

