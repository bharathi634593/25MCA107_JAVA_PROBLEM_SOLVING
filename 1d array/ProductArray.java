import java.util.Scanner;

class ProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.println("ENTER A VALUE :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            product *= arr[i];
        }

        System.out.println(product);
    }
}