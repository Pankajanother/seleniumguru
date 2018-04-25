public class OrConditionalExpression
{
 public static void main(String args[])
 {
     double account_balance = 10050000.84;
     int age = 55;
     //  if conditional execution  with OR
     if (account_balance >= 1000000 || age >= 65) {
         System.out.println("You can retire now.GOOD luck");
     }  else
          {System.out.println("You still need to  savve money for retirememnt");
     }
 }
}
