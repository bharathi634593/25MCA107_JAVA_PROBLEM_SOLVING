import java.util.Scanner;

class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A WORDS :");
        String name = sc.nextLine();

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ')
                count++;
        }

        System.out.println("Total characters (excluding spaces): " + count);
    }
}