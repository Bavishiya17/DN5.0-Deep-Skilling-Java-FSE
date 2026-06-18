public class Main {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.print("Singleton Pattern Example");

        if (l1 == l2) {
            System.out.println("Only one object created");
        } else {
            System.out.println("Different objects created");
        }
    }
}