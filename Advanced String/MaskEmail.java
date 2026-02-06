import java.util.Scanner;

class MaskEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A MAIL ID :");
        String email = sc.nextLine();

        int atPos = email.indexOf('@');
        String username = email.substring(0, atPos);
        String domain = email.substring(atPos);

        String masked = username.substring(0, 2) + "*****";
        System.out.println(masked + domain);
    }
}