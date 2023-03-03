public class AccountTester
 {
     public static void main(String[] args)
     {
         Account varshasAcc =  new Account(1000, 0.10);
         varshasAcc.withdraw(250);
         varshasAcc.deposit(400);
         varshasAcc.addInterest();
         System.out.println(varshasAcc.getBalance());
         System.out.println("Expected: 1265.0");
         //1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
     }
 }
