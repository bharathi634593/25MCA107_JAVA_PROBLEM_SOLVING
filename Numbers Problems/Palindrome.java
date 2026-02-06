import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt(), temp = n, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (rev == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}