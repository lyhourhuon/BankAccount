
package classexample;

public class ClassExample {

    public static void main(String[] args) {
       
      
        BankAccount a2 = new BankAccount("Lyhour", 1500,100,88);  // non-default costructor
        
        System.out.println();
        
        a2.setBalance(1500);                                        // set and get
        a2.setName("Lyhour");
        System.out.println("Bank account of " + a2.getName() + " Your balance is $" + a2.getBalance());
        System.out.println();
        
        
        System.out.println("Balance after deposited is $"+ a2.deposit(100));  // deposit method
        
        System.out.println("Balance after withdrawed is $" + a2.withdraw(88));  // withdraw method
        System.out.println();
        
        System.out.println(a2.toString());      // toString method



    }
    
}
