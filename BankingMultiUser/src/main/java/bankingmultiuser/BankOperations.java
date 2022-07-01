package bankingmultiuser;
import java.util.ArrayList;
public class BankOperations {
    public static void credit(ArrayList<User> arr, double credit,int index) {
        double newCurrentAmount = credit + arr.get(index).getCurrentAmount();
        arr.get(index).setCurrentAmount(newCurrentAmount);
        System.out.println("Credited amount = " + credit);
        System.out.println("Current amount = " + arr.get(index).getCurrentAmount());
        
        Transactions t = new Transactions("Credit", credit);

        arr.get(index).transaction.add(t);

    }


public static void debit(ArrayList<User> arr , double debit, int index){
        if(debit < arr.get(index).getCurrentAmount()){
            double newCurrentAmount = arr.get(index).getCurrentAmount() - debit;
            arr.get(index).setCurrentAmount(newCurrentAmount);
            System.out.println("Debited amount = " + debit);
            System.out.println("Current amount = " + arr.get(index).getCurrentAmount());

            Transactions trans = new Transactions("Debited",debit);
            arr.get(index).transaction.add(trans);
            }
        
        else{
            System.out.println("Insufficient balance!!");
        }
    }
    public static void viewHistory(ArrayList<User> arr,int index){
        for(int i=0; i<arr.get(index).getTransaction().size(); i++){
                System.out.println(arr.get(index).getTransaction().get(i).transactionType);
                System.out.println(arr.get(index).getTransaction().get(i).transactionAmount);
        }
    }
    
    public static void showDetails(ArrayList<User> arr,int index){
        System.out.println("Account number = " + arr.get(index).getAccountNumber());
        System.out.println("Name = " + arr.get(index).getName());
        System.out.println("Email address = " + arr.get(index).getEmail());
        System.out.println("Contact number = " +arr.get(index).getContactNo());
        System.out.println("Age = " + arr.get(index).getAge());
        System.out.println("AccountType = " + arr.get(index).getAccountType());
        System.out.println("Address = " + arr.get(index).getAddress());
        System.out.println("City = " + arr.get(index).getcity());
        System.out.println("Pincode = " + arr.get(index).getPincode());
        System.out.println("Account Balance = " + arr.get(index).getCurrentAmount());
        System.out.println("Adhar card number = " + arr.get(index).getAdharcard());
    }
}
