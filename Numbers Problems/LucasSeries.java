import java.util.Scanner;

class LucasSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A VALUE :");
        int n = sc.nextInt();

        int a = 2, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}