public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping values are:"+a+" "+b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
         // Swapping using + and - operators
        a = a + b; // a becomes 30
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)
        
        // Swapping using * and / operators
        a = a * b; // a becomes 200
        b = a / b; // b becomes 10 (200 / 20)
        a = a / b; // a becomes 20 (200 / 10)

        System.out.println("After swapping values are:"+a+" "+b);
    }
}
