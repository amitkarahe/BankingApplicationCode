package bankingmultiuser;
import java.util.Scanner;
import java.util.ArrayList;
public class BankSystemApplication {
    public static void main(String[] args){
        ArrayList<User> arr = new ArrayList<User>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to start.......");
        int st = sc.nextInt();
        while(st==1){
        System.out.println("Enter 1 for Registration and 2 for Login = ");
        int value = sc.nextInt();
        switch(value){
            
            case 1:
                User user = Registration.getRegistration();
                arr.add(user);
                Login.getLogin(arr);
                break;
            case 2:
                Login.getLogin(arr);
                break;
        }
        }}
}
