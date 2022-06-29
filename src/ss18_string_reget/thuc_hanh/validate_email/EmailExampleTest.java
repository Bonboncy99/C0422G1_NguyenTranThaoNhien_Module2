package ss18_string_reget.thuc_hanh.validate_email;

import java.util.Scanner;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        emailExample = new EmailExample();
//        for (String email : validEmail) {
//            boolean isvalid = emailExample.validate(email);
//            System.out.println("Email is " + email +" is valid: "+ isvalid);
//        }
//        for (String email : invalidEmail) {
//            boolean isvalid = emailExample.validate(email);
//            System.out.println("Email is " + email +" is valid: "+ isvalid);
//        }
        do {
            System.out.println("Nhaapj email can kiem tra");
            String email = scanner.nextLine();
            System.out.println(EmailExample.validate(email));
            if (EmailExample.validate(email)){
                System.out.println(email);
                break;
            }
        } while (true);

    }
}
