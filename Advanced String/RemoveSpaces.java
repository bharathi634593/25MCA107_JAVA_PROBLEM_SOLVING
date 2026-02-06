
import java.util.Scanner;

class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A CHARACTERS :");
        String text = sc.nextLine();

        System.out.println(text.trim());
    }
}
