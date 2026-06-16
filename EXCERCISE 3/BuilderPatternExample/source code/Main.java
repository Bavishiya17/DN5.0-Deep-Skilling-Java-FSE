public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(8)
                .setStorage(512)
                .build();

        Computer computer2 = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(1024)
                .build();

        computer1.display();

        System.out.println();

        computer2.display();
    }
}