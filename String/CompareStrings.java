import java.util.Scanner;

class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  System.out.println("ENTER STR 1 :");
        String s1 = sc.nextLine();
          System.out.println("ENTER STR 2 :");

        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);

        if (result == 0)
            System.out.println("Equal");
        else if (result < 0)
            System.out.println(s1 + " < " + s2);
        else
            System.out.println(s1 + " > " + s2);
    }
}