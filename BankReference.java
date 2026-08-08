import java.util.Scanner;

public class BankReference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter reference: ");
        String input = sc.nextLine();

        input = input.trim();

        String bank = input.substring(0, 3).toUpperCase();
        String rest = input.substring(3);

        String reference = bank + rest;

        if (reference.length() != 14) {
            System.out.println("Invalid: wrong length");
        }
        else {

            boolean validBank = true;

            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(reference.charAt(i))) {
                    validBank = false;
                }
            }

            if (!validBank) {
                System.out.println("Invalid: bank code must be 3 letters");
            }
            else {

                boolean validBody = true;

                for (int i = 3; i < 14; i++) {
                    if (!Character.isDigit(reference.charAt(i))) {
                        validBody = false;
                    }
                }

                if (!validBody) {
                    System.out.println("Invalid: body must contain only digits");
                }
                else {

                    String date = reference.substring(3, 9);
                    String sequence = reference.substring(9, 14);

                    String formattedDate =
                            date.substring(0, 2) + "/" +
                            date.substring(2, 4) + "/" +
                            date.substring(4, 6);

                    System.out.println(
                            "[" + bank + "] DATE: " +
                            formattedDate + " | SEQ: " +
                            sequence
                    );
                }
            }
        }
    }
}
