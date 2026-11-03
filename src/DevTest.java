import java.util.Scanner;


public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        SafeInput.prettyHeader("MODULE 8 METHODS");
        System.out.println(); // Space for cleaner output


        System.out.println("--- Testing getNonZeroLenString ---");
        System.out.println("(Test tip: Press Enter immediately once to test rejection, then type your text)");
        String userString = SafeInput.getNonZeroLenString(in, "Please enter a non-empty string");
        System.out.println("[TEST EVIDENCE] getNonZeroLenString returned: \"" + userString + "\"\n");


        System.out.println("--- Testing getInt ---");
        System.out.println("(Test tip: Enter 'abc' first to test rejection, then type 42)");
        int userInt = SafeInput.getInt(in, "Please enter an integer");
        System.out.println("[TEST EVIDENCE] getInt returned: " + userInt);


        in.close();
    }
}

