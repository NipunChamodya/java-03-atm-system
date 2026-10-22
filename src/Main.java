import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 25000.0;
        int choose;
        String savedPassword = "1234";

        System.out.println("Welcome");
        System.out.println("Enter your Password");

        String enterPassword = input.next();

        while (savedPassword.equals(enterPassword)) {


            System.out.println("/n Welcome ABC bank ATM");
            System.out.println("____");
            System.out.println("Press 1 to check your balance");
            System.out.println("Press 2 and deposit");
            System.out.println("Press 3 and try to withdraw");
            System.out.println("Press 4 to exit");
            System.out.println("____");
            System.out.println("Please use 1 - 4 numbers only in the menu");
            System.out.println("____");

            choose = input.nextInt();

            if (choose == 1) {

                System.out.println("Your balance is " + balance);

             } else if (choose == 2) {

                System.out.println(" Input the money ");
                double deposit = input.nextInt();
                System.out.println(" Counting . . . ");
                balance = balance + deposit;

                System.out.println("You deposit " + balance);

             } else if (choose == 3) {

                System.out.println(" Enter amount ");
                double withdraw = input.nextInt();

                if (withdraw > balance) {

                    System.out.println(" You havan't enough money in your account ");

                } else {

                    System.out.println(" Collect your money ");
                    balance = balance - withdraw;
                    System.out.println(" Remaining balance is " + balance);
                }

             } else if (choose == 4) {
                System.out.println(" Thank you banking with us ");
                break;

             } else {
                System.out.println("Warning! Please use 1 - 4 numbers only in the menu");


            }


        }


    }

}