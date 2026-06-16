import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Light light = new Light();

        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        System.out.println("1. Turn ON");
        System.out.println("2. Turn OFF");
        int choice = sc.nextInt();

        if (choice == 1) {
            remote.setCommand(on);
        } else {
            remote.setCommand(off);
        }

        remote.pressButton();

        sc.close();
    }
}