import java.util.Scanner;

class Comparecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  System.out.println("ENTER A STR1 :");
        String s1 = sc.nextLine();
          System.out.println("ENTER A STR2 :");

        String s2 = sc.nextLine();

        if (s1.equalsIgnoreCase(s2))
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");
    }
}