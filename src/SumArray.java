import java.util.Scanner;

class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  System.out.println("ENTER A VALUE :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println(sum);
    }
}