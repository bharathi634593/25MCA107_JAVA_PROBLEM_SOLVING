import java.util.Scanner;

class CharAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.println("ENTER A STRING : ");
        String text = sc.nextLine();
        int index = sc.nextInt();

        System.out.println("Character at index " + index + " is: " + text.charAt(index));
    }
}