public class CommitCafe {

    private static String barista = "Vladimir-Coffeemeister"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println(barista + " is brewing: " + drink);

        if (drink.equals("Espresso")) {
            System.out.println("Strong espresso shot! Here you go.");
        } 
        else {
            System.out.println("Smooth and creamy drink, Enjoy");
        }
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}