public class Main {

    public static void main(String[] args) {

        // Assert Equals
        if (5 == (2 + 3))
            System.out.println("assertEquals PASSED");
        else
            System.out.println("assertEquals FAILED");

        // Assert True
        if (5 > 3)
            System.out.println("assertTrue PASSED");
        else
            System.out.println("assertTrue FAILED");

        // Assert False
        if (!(5 < 3))
            System.out.println("assertFalse PASSED");
        else
            System.out.println("assertFalse FAILED");

        // Assert Null
        Object obj1 = null;
        if (obj1 == null)
            System.out.println("assertNull PASSED");
        else
            System.out.println("assertNull FAILED");

        // Assert Not Null
        Object obj2 = new Object();
        if (obj2 != null)
            System.out.println("assertNotNull PASSED");
        else
            System.out.println("assertNotNull FAILED");
    }
}
