import java.util.Scanner;

class ProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A NUMBERS :");
        int n = sc.nextInt(), prod = 1;

        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        System.out.println(prod);
    }
}