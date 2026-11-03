import java.util.Scanner;
public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retVal = "";
        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() == 0) {
                System.out.println("Error: Input cannot be empty. Please try again.");
            }
        } while (retVal.length() == 0);

        return retVal;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean isValid = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                isValid = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: \"" + trash + "\" is not a valid integer. Please try again.");
            }
        } while (!isValid);
        return retVal;
    }


    public static void prettyHeader(String msg) {
        int totalWidth = 60;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("***");

        int totalSpacesNeeded = totalWidth - 6 - msg.length();
        int leftSpaces = totalSpacesNeeded / 2;
        int rightSpaces = totalSpacesNeeded - leftSpaces;

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }

        System.out.println("***");


        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}



