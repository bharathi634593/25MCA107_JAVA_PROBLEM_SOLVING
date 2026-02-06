import java.util.Scanner;

class AdamNumber {
    static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt();

        int sq = n * n;
        int revSq = reverse(reverse(n) * reverse(n));

        System.out.println(sq == revSq ? "Adam Number" : "Not Adam Number");
    }
}