package nunes;

import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        System.out.print("Type a password: ");
        String password =scanner.nextLine();

        User user = new User(password);
        System.out.print("Password before hashUserPassword: " + user.getPassword() + "\n");
        System.out.print("Salt before hashUserPassword: " + user.getSalt() + "\n");
        System.out.print("Salt before hashUserPassword: " + user.getHashedPassword() + "\n");

        try {
            NSALoginController.hashUserPassword(user);
        }
        catch (Exception ex) {
            System.out.println("ERROR" + ex.getMessage());
        }

        System.out.print("Password after hashUserPassword: " + user.getPassword() + "\n");
        System.out.print("Salt after hashUserPassword: " + user.getSalt() + "\n");
        System.out.print("Salt after hashUserPassword: " + user.getHashedPassword() + "\n");

        System.out.print("Type your password again: ");
        password = scanner.nextLine();

        user.setPassword(password);

        System.out.print("Let's see if the password match...\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try
        {
            if (NSALoginController.verifyPassword(user)) {
                System.out.println("Passwords match!");
            }
            else
            {
                System.out.println("ERROR: Passwords do not match!");
            }
        } catch (Exception ex) {
            System.out.println("ERROR" + ex.getMessage());
        }

        //System.out.print(password);

    }
}