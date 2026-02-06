import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.println("ENTER A VALUE :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();
        boolean found = false;

        for (int x : arr) {
            if (x == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}