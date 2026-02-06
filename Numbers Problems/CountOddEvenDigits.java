import java.util.Scanner;

class CountOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt(), odd = 0, even = 0;

        while (n > 0) {
            if ((n % 10) % 2 == 0) even++;
            else odd++;
            n /= 10;
        }
        System.out.println("Odd = " + odd + ", Even = " + even);
    }
}