import java.util.Scanner;

class SearchCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.println("ENTER A WORDS :");
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}