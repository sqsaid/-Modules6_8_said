public class DoWhileWithABooleanFlag {
    public static void main(String[] args) {
        System.out.println("PART C: THREE GREETINGS");
        int totalHellos = 0;
        boolean keepRunning = true;
        do {
            System.out.println("Hello");
            totalHellos++;
            if (totalHellos >= 3) {
                keepRunning = false;
            }
        } while (keepRunning);
        System.out.println();
    }
}
