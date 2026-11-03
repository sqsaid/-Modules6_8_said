public class LoopPractice {
    public static void main(String[] args) {


        System.out.println("PART A: COUNTING AND STEPPING");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}