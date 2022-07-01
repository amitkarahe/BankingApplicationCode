package bankingmultiuser;
import java.util.ArrayList;
public class User {
    private String name;
    private String email;
    private long contactNo;
    private int age;
    private String address;
    private String city;
    private int pincode;
    private String adharcardNo;
    private String accountType;
    private double currentAmount;
    private String accountNo;
    private String password;
   
    ArrayList<Transactions> transaction= new ArrayList<Transactions>();
    
    public User(String name,String email,long contactNo,int age,String address,String city,int pincode,String adharcardNo,String accountType,double currentAmount,String password ){
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.age = age;
        this.address = address;
        this.city = city;
        this.pincode  = pincode;
        this.adharcardNo = adharcardNo;
        this.accountType = accountType;
        this.currentAmount = currentAmount;
        accountNo = contactNo + "BOB";
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public long getContactNo(){
        return contactNo;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getcity(){
        return city;
    }
    public int getPincode(){
        return pincode;
    }
    public String getAdharcard(){
        return adharcardNo;
    }
    public String getAccountType(){
        return accountType;
    }
    public double getCurrentAmount(){
        return currentAmount;
    }
    public String getAccountNumber(){
        return accountNo;
    }
    public String getPassword(){
        return password;
    }
    public ArrayList<Transactions> getTransaction(){
        return transaction;
    }
    public void setCurrentAmount(double currentAmount){
        this.currentAmount = currentAmount;
    }
}
