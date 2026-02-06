import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt();

        while (n > 0) {
            System.out.print((n % 10) + " ");
            n /= 10;
        }
    }
}