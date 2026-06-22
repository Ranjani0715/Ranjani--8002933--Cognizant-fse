public class Main {

    public static void main(String[] args) {

        // Get Logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use logger
        logger1.log("Application started.");
        logger2.log("Singleton pattern implemented.");

        // Verify same instance
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple instances created.");
        }
    }
}