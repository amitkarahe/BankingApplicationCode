package bankingmultiuser;

import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void getLogin(ArrayList<User> arr) {
        Scanner sc = new Scanner(System.in);
        int value = 0;

        System.out.println("--------Welcome to login page-------");
        System.out.println("Enter your account number ");
        String account = sc.next();
        System.out.println("Enter your Password = ");
        String password = sc.next();
        int index;
        for (index = 0; index < arr.size(); index++) {
            if (account.equals(arr.get(index).getAccountNumber()) && password.equals(arr.get(index).getPassword())) {
                do {
                    System.out.println("Enter 1 to credit , Enter 2 to debit , Enter 3 to view all transaction , Enter 4 to show details");
                    int temp = sc.nextInt();
                    switch (temp) {
                        case 1:
                            System.out.println("Enter credit amount = ");
                            double creditAmount = sc.nextDouble();
                            BankOperations.credit(arr, creditAmount, index);
                            break;

                        case 2:
                            System.out.println("Enter debit Amount = ");
                            double debitAmount = sc.nextDouble();
                            BankOperations.debit(arr, debitAmount, index);
                            break;

                        case 3:
                            BankOperations.viewHistory(arr, index);
                            break;

                        case 4:
                            BankOperations.showDetails(arr, index);
                            break;

                    }
                    System.out.println("Enter 1 to continue and any other key to exit");
                    value = sc.nextInt();

                } while (value == 1);
                System.out.println("Enter 1 for Registration and 2 for Login = ");
                int val = sc.nextInt();

                switch (val) {

                    case 1:
                        User user = Registration.getRegistration();
                        arr.add(user);
                        getLogin(arr);
                        break;
                    case 2:
                        getLogin(arr);
                        break;
                }
            } if(account.equals(arr.get(index).getAccountNumber()) && password.equals(arr.get(index).getPassword())) {
                System.out.println("Incorrect Username or Password ");
            }
        }
        getLogin(arr);

    }

}
