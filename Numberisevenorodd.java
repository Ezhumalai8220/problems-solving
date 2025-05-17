import java.util.*;

public class Numberisevenorodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n % 2 == 1)
            System.out.println(n + "is even");
        else
            System.out.println(n + "is odd");

    }
}
