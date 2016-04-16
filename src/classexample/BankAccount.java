
package classexample;


public class BankAccount {
    private double balance;
    private String name;
   
    BankAccount(String name, double balance, double deposit,double withdraw){
        double balance1 = balance + deposit - withdraw;
        System.out.println("The bank account is belong to "+name+",has balance " + balance1);
    }

   
    
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getName(){
        return name; 
    }
    public double getBalance(){
        return balance;
    }
    double balance2;
    public double deposit(double deposit){
        balance2 = balance + deposit;
        return balance2;
    }
    public double withdraw(double withdraw){
        return balance2 - withdraw;
        
    }
    
    
    public String toString(){
        return "The bank account is belong to "+ name+ " the origional balance is $" + balance; 
     
    }
    }
    

