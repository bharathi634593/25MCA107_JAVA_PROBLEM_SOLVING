import java.util.Scanner;

class PrintCharsWithSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A NAME :");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}