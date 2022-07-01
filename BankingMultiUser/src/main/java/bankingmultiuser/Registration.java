package bankingmultiuser;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    public static User getRegistration(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name = ");
        String name = sc.next();
        System.out.println("Enter your email id = ");
        String email = sc.next();
        System.out.println("Enter your Mobile number = ");
        long contactNo = sc.nextLong();
        System.out.println("Enter your Age = ");
        int age = sc.nextInt();
        System.out.println("enter your address");
        String address = sc.next();
        System.out.println("enter your city`");
        String city = sc.next();
        System.out.println("enter your pincode");
        int pincode = sc.nextInt();
        System.out.println("enter your adhar number");
        String adharcardNo = sc.next();
        System.out.println("enter your account type");
        String accountType = sc.next();
        System.out.println("enter your password");
        String password = sc.next();

        User user = new User(name, email, contactNo, age, address, city, pincode, adharcardNo, accountType, 0, password);
        return user;
    }
}

        
