//Author:		Joyeuse Kabanyana;


import java.util.*;

public class XyzWallet {

    public static void main(String args[]){

        //creating scanner
        Scanner newString = new Scanner(System.in);
        Scanner newString1 = new Scanner(System.in);

        //The Balance Variable
        double myBalance = 1000.0;

        //creating a list  of Transaction
        List<Transaction> listTransaction = new ArrayList<>();

        //================================CreateUser codes===========================================

        //New User Creation
        System.out.println("\n");
        System.out.println("Welcome on XYZ Company E-Wallet");
        System.out.println("\n");
        System.out.println("NEW USER CREATION");
        System.out.print("User Name:     "+"\t");
        String printUserName =newString1.nextLine();

        System.out.print("User Passcode:     "+"\t");
        long printUserPass =newString.nextInt();

        System.out.print("User Phone (eg: 2501234567):     "+"\t");
        String printUserPhone =newString1.nextLine();

        System.out.println("\nDear " + printUserName + ", Your account in XYZ Company was successfully created...");

        System.out.println("You received 1000 RWF Bonus");

        /*================================CreateUser codes END===========================================*/


        /*================================Choosing transaction===========================================*/
        String permissionChoice = "";

        while(!permissionChoice.equals("0")){
            System.out.println("\nType 1 To Check Balance \nType 2 To Send Money \nType 3 To Save Money \nor Type 0 To Quit");
            System.out.print("\n Type Here: ");
            permissionChoice = newString1.nextLine();
            switch(permissionChoice) {

                //Checking Balance
                case "1":
                    System.out.println("Your balance is: "+ myBalance +"Rwf. \n");
                    break;

                //Sending Money
                case "2":
                    System.out.print("Receiver's Number (eg: 2501234567):     "+"\t");
                    String printReceiverName = newString1.nextLine();

                    System.out.print("Amount to send:     "+"\t");
                    double printAmount =newString.nextInt();
                    if(printAmount <= myBalance){
                        System.out.print("Confirm your Passcode:     "+"\t");
                        long printUserPasscode2 =newString.nextInt();
                        if(printUserPasscode2 == printUserPass){
                            double remainder = myBalance - printAmount;
                            myBalance = remainder;
                            System.out.println("You are remaining with " + myBalance + "Rwf, in your account");
                        } else {
                            System.out.println("Wrong passcode, try again...");
                        }

                    }else
                        System.out.println("You have insufficient Balance...");
                    break;

                //Saving Money on Wallet
                case "3":
                    System.out.print("Enter the amount you want to Save:     "+"\t");
                    double printAdditionalAmount =newString.nextInt();
                    myBalance += printAdditionalAmount;

                    System.out.println("Your new Balance is: " + myBalance +"Rwf");
                    break;
            }
        }

        /*================================Choosing codes END===========================================*/





    }
}

class CreateUser{
    int AuthId;
    int AuthAge;
    int AuthPhone;
    String AuthName;
    String AuthCountry;

    CreateUser(int AuthId, String AuthName, int AuthPhone, int AuthAge, String AuthCountry){
        this.AuthId = AuthId;
        this.AuthName = AuthName;
        this.AuthPhone = AuthPhone;
        this.AuthAge = AuthAge;
        this.AuthCountry = AuthCountry;
    }
}


class Transaction{
    int bookId;
    int bookYear;
    String bookName;
    String bookAuthor;

    Transaction(int bookId, String bookName, int bookYear, String bookAuthor){
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.bookAuthor = bookAuthor;
    }
}
