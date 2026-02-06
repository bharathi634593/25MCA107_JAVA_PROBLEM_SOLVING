import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("ENTER A NUMBERS :");
        int n = sc.nextInt();
        int count = 0;

        do {
            count++;
            n /= 10;
        } while (n != 0);

        System.out.println(count);
    }
}