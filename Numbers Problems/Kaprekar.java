import java.util.Scanner;

class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt();
        int sq = n * n;

        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        System.out.println(sum == n ? "Kaprekar Number" : "Not Kaprekar Number");
    }
}