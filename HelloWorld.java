import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scanner.nextLine(); // Read user input
        if (name != null && name.length() > 0) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
        else{ 
            name = "Person. I can't believe you were to lazy to enter your name";
        }
        System.out.println("Hello " + name + "! You are awesome!");
        scanner.close();

    }
}