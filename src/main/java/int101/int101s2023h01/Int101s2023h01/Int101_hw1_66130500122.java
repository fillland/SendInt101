
package int101.int101s2023h01.Int101s2023h01;
import work03.MyUtil;
import work04.BankAccount;
import work04.Person;
/**
 *
 * @author mcinl
 */
public class Int101_hw1_66130500122 {
    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();
    }
    static void work01Question(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       // do nothing in this method; do your work in work01Question()
       boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6); 
       System.out.println("Work01:Question: b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       // remove () as many as possible from the following expression
       // but do not change the meaning of the expression; 
       // regardless of the values of the parameters: b1-b6 .
       boolean b = (b1 ^ b2 | b3) && b4 || b5 & b6; 
       System.out.println("Work01:Answer: b = " + b);
    }
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
       // do nothing in this method; do your work in work02Question()
       boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6)); 
       System.out.println("Work02:Question: b = " + b);
    }
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
       // remove () as many as possible from the following expression
       // but do not change the meaning of the expression; 
       // regardless of the values of the parameters: b1-b6 .
       boolean b = v1 << v2 < v3 != v3 > (v4 ^ v5 | v6); 
       System.out.println("Work02: Question: b = " + b);
    }

    private static void work03UseOfUtilityClass() {
        double bmi = MyUtil.calculateBMI(60, 1.75);//Change Weight and Height
        System.out.println(bmi);
        double average = MyUtil.average(20,50,30);//Change v1 v2 v3
        System.out.println(average);
    }

    private static void work04UseOfObjectClass() {
       Person Manager = new Person(001);
        Person customer = new Person(002);
        customer.setId(002); //change customer id

        BankAccount manager = new BankAccount(1, Manager);
        BankAccount Customer = new BankAccount(2, customer);
        System.out.println("manager balance = " + manager.getBalance());
        System.out.println("customer balance = " + Customer.getBalance());

        manager.deposit(1000);
        System.out.println("manager balance = " + manager.getBalance());

        manager.withdraw(100);
        System.out.println("manager balance = " + manager.getBalance());

        manager.transfer(500, Customer);
        System.out.println("manager balance = " + manager.getBalance());
        System.out.println("customer balance = " + Customer.getBalance());
    }
    
}
