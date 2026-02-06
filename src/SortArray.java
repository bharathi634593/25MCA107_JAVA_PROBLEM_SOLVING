import java.util.Scanner;
import java.util.Arrays;

class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("ENTER A VALUE :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}