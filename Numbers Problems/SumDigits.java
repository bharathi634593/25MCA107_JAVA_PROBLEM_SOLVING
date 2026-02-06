import java.util.Scanner;

class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("ENTER A NUMBERS :");
        int n = sc.nextInt(), sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}