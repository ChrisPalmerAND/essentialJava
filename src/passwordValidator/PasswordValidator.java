package passwordValidator;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        User user = new User();
        Password password = new Password();
        String newPassword;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your new password: ");
        newPassword = scanner.nextLine();

        boolean validate = password.runAllChecks(user.getPassword(), user.getUsername(), newPassword);

        if(validate){
            user.setPassword(newPassword);
            System.out.println("Your new password is valid");
        } else {
            System.out.println("Your password is invalid. The program will now explode.");
        }
        System.out.println(user.getPassword());
    }
}
