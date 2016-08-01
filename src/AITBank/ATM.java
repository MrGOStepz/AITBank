/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;
import javax.swing.JOptionPane; //import the message box.
/**
 *
 * @author Warawat
 */
public class ATM 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Accounts userAccount = new Accounts();
        showDisplay("Insert Your Card!");       
        //Got the detail from card.
        DetailUser UserAccount = new DetailUser(); 
              
        //Check PIN
        boolean bCheckPIN = true;
        do
        {
            String strUserPW = JOptionPane.showInputDialog("Put The PIN");
            if(!UserAccount.PIN.equals(strUserPW))
            {
                JOptionPane.showMessageDialog(null, "PIN is incorrect!\n"
                        + "Please try again!");
            }
            else
            {
                bCheckPIN = false;
            }
        }while(bCheckPIN);               
        
        //Choice of transection
        selectTransaction(UserAccount);

    }
    
    public static void selectTransaction(DetailUser _userAccount)
    {
        String strChoice = JOptionPane.showInputDialog("1.Deposit\n"
                + "2.Withdraw\n"
                + "3.Balace Enquiry\n"
                + "4.Cancel");
        
        switch(strChoice)
        {
            case "1":
                //Deposit Process
                DepositMoney(_userAccount);
                break;
            case "2":
                //Withdraw Process
                WithdrawMoney(_userAccount);
                break;
            case "3":
                //Balance Enquiry Process
                BalanceEnquiry(_userAccount);
                break;
            case "4":
                //Cancle Transaction
                JOptionPane.showMessageDialog(null, "Return your card!","Trasaction is cancled",JOptionPane.WARNING_MESSAGE);
                break;    
            default:
                break;
        }
    }

    public static void DepositMoney(DetailUser UserAccount)
    {
        String strChoice = JOptionPane.showInputDialog("Choose the Account!\n"
                + "1.Saving Account\n"
                + "2.Net-Saving Account\n"
                + "3.Cheque Account\n"
                + "4.Fix Account\n"
                + "5.Cancle");
        
        switch(strChoice)
        {
            case "1": 
                savingAccount(UserAccount,1);// 1 is deposit code
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                break;
                
        }
    }
    /**
     * Withdraw Money Process
     * @param UserAccount 
     */
    public static void WithdrawMoney(DetailUser UserAccount)
    {
        String strChoice = JOptionPane.showInputDialog("Choose the Account!\n"
                + "1.Saving Account\n"
                + "2.Net-Saving Account\n"
                + "3.Cheque Account\n"
                + "4.Fix Account\n"
                + "5.Cancle");
        
        switch(strChoice)
        {
            case "1":
                savingAccount(UserAccount,2); //2 is withdraw code
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                break;                
        }
    }
    
    /**
     * Saving Account Process
     */
    public static void savingAccount(DetailUser _userAccount, int _code)
    {
        if(_code == 1)//Deposit Money 
        {
            float money = Float.parseFloat(JOptionPane.showInputDialog("How many do want to deposit ?"));
            SavingAccounts savingAcc = new SavingAccounts(_userAccount.savingBalance);
            savingAcc.depositMoney(money);
            _userAccount.savingBalance = savingAcc.getSavingBalance();
            showDisplay("Your deposit is " + money);
            showDisplay (_userAccount.savingBalance);
        }
        else if(_code == 2) //Withdeaw Money
        {
            boolean bCheckMaxWith = false;
            do
            {
                int money = Integer.parseInt(JOptionPane.showInputDialog("How many do want to Withdraw ?"));
                SavingAccounts savingAcc = new SavingAccounts(_userAccount.savingBalance, _userAccount.MaxWithdraw);
                
                if (money > savingAcc.getSavingBalance())
                {
                    showDisplay("You don't have enough money \n"
                            + "You have "+savingAcc.getSavingBalance());
                    bCheckMaxWith = true;
                }
                else if (money > savingAcc.maxWithdraw)
                {
                    showDisplay("Your Maximun withdeaw is "+savingAcc.maxWithdraw);
                    bCheckMaxWith = true;
                }
                else
                {
                    savingAcc.withdrawMoney(money);
                    _userAccount.savingBalance = savingAcc.getSavingBalance();
                    bCheckMaxWith = false;
                    
                    showDisplay (_userAccount.savingBalance);
                }
            }while(bCheckMaxWith);
        }
        finishTransaction(_userAccount);
    }
    
    /**
     * Net Saving Account
     * @param _userAccount
     * @param _code 
     */
    public static void netSavingAccounts(DetailUser _userAccount, int _code)
    {
        if(_code == 1)//Deposit Money 
        {
            float money = Float.parseFloat(JOptionPane.showInputDialog("How many do want to deposit ?"));
            NetSavingAccounts netSavingAcc = new NetSavingAccounts(_userAccount.netSavingBalance);
            netSavingAcc.depositMoney(money);
            _userAccount.savingBalance = savingAcc.getSavingBalance();
            showDisplay("Your deposit is " + money);
            showDisplay (_userAccount.savingBalance);
        }
        else if(_code == 2) //Withdeaw Money
        {
            boolean bCheckMaxWith = false;
            do
            {
                int money = Integer.parseInt(JOptionPane.showInputDialog("How many do want to Withdraw ?"));
                SavingAccounts savingAcc = new SavingAccounts(_userAccount.savingBalance, _userAccount.MaxWithdraw);
                
                if (money > savingAcc.getSavingBalance())
                {
                    showDisplay("You don't have enough money \n"
                            + "You have "+savingAcc.getSavingBalance());
                    bCheckMaxWith = true;
                }
                else if (money > savingAcc.maxWithdraw)
                {
                    showDisplay("Your Maximun withdeaw is "+savingAcc.maxWithdraw);
                    bCheckMaxWith = true;
                }
                else
                {
                    savingAcc.withdrawMoney(money);
                    _userAccount.savingBalance = savingAcc.getSavingBalance();
                    bCheckMaxWith = false;
                    
                    showDisplay (_userAccount.savingBalance);
                }
            }while(bCheckMaxWith);
        }
        finishTransaction(_userAccount);
    }
    
    /**
     * Fixed Accounts
     * @param _userAccount
     * @param _code 
     */
    public static void fixedAccoutns(DetailUser _userAccount, int _code)
    {
    if(_code == 1)//Deposit Money 
        {
            float money = Float.parseFloat(JOptionPane.showInputDialog("How many do want to deposit ?"));
            SavingAccounts savingAcc = new SavingAccounts(_userAccount.savingBalance);
            savingAcc.depositMoney(money);
            _userAccount.savingBalance = savingAcc.getSavingBalance();
            showDisplay("Your deposit is " + money);
            showDisplay (_userAccount.savingBalance);
        }
        else if(_code == 2) //Withdeaw Money
        {
            boolean bCheckMaxWith = false;
            do
            {
                int money = Integer.parseInt(JOptionPane.showInputDialog("How many do want to Withdraw ?"));
                SavingAccounts savingAcc = new SavingAccounts(_userAccount.savingBalance, _userAccount.MaxWithdraw);
                
                if (money > savingAcc.getSavingBalance())
                {
                    showDisplay("You don't have enough money \n"
                            + "You have "+savingAcc.getSavingBalance());
                    bCheckMaxWith = true;
                }
                else if (money > savingAcc.maxWithdraw)
                {
                    showDisplay("Your Maximun withdeaw is "+savingAcc.maxWithdraw);
                    bCheckMaxWith = true;
                }
                else
                {
                    savingAcc.withdrawMoney(money);
                    _userAccount.savingBalance = savingAcc.getSavingBalance();
                    bCheckMaxWith = false;
                    
                    showDisplay (_userAccount.savingBalance);
                }
            }while(bCheckMaxWith);
        }
        finishTransaction(_userAccount);
    }
    
    /**
     * Cheque Accounts
     * @param _userAccount
     * @param _code 
     */
    public static void chequeAccounts(DetailUser _userAccount, int _code)
    {
    if(_code == 1)//Deposit Money 
        {
            float money = Float.parseFloat(JOptionPane.showInputDialog("How many do want to deposit ?"));
            SavingAccounts savingAcc = new SavingAccounts(_userAccount.savingBalance);
            savingAcc.depositMoney(money);
            _userAccount.savingBalance = savingAcc.getSavingBalance();
            showDisplay("Your deposit is " + money);
            showDisplay (_userAccount.savingBalance);
        }
        else if(_code == 2) //Withdeaw Money
        {
            boolean bCheckMaxWith = false;
            do
            {
                int money = Integer.parseInt(JOptionPane.showInputDialog("How many do want to Withdraw ?"));
                SavingAccounts savingAcc = new SavingAccounts(_userAccount.savingBalance, _userAccount.MaxWithdraw);
                
                if (money > savingAcc.getSavingBalance())
                {
                    showDisplay("You don't have enough money \n"
                            + "You have "+savingAcc.getSavingBalance());
                    bCheckMaxWith = true;
                }
                else if (money > savingAcc.maxWithdraw)
                {
                    showDisplay("Your Maximun withdeaw is "+savingAcc.maxWithdraw);
                    bCheckMaxWith = true;
                }
                else
                {
                    savingAcc.withdrawMoney(money);
                    _userAccount.savingBalance = savingAcc.getSavingBalance();
                    bCheckMaxWith = false;
                    
                    showDisplay (_userAccount.savingBalance);
                }
            }while(bCheckMaxWith);
        }
        finishTransaction(_userAccount);
    }
    
    public static void finishTransaction(DetailUser _userAccount)
    {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose \n "
                + "1. New trasaction \n"
                + "2. Finish"));
        if(choice == 1)
        {
            selectTransaction(_userAccount);
        }
        else if (choice == 2)
        {
            showDisplay("Thank you \n"
                    + "Return your card");
        }
    }
    
    public static void BalanceEnquiry(DetailUser _userAccount)
    {
        Accounts accUser = new Accounts(_userAccount.balanceEnquiry);
        showDisplay(accUser.getBalancEquiry());
        finishTransaction(_userAccount);
    }
    
    public static void showDisplay(String _string)
    {
        JOptionPane.showMessageDialog(null, _string);
    }
    
    public static void showDisplay(float _float)
    {
        JOptionPane.showMessageDialog(null, _float);
    }
}
