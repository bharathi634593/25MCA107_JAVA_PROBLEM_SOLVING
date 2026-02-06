import java.util.Scanner;
import java.util.HashSet;

class HappyNumber {
    static int sumSq(int n) {
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sumSq(n);
        }

        System.out.println(n == 1 ? "Happy Number" : "Not Happy Number");
    }
}