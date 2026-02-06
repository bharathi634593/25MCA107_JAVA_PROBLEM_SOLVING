import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt(), temp = n, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
    }
}