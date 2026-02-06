import java.util.Scanner;

class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  System.out.println("ENTER A VALUE :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        boolean printed = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    printed = true;
                    break;
                }
            }
        }

        if (!printed)
            System.out.println("No Duplicates");
    }
}