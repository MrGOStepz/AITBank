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
        Accounts UserAccount = new Accounts();
        JOptionPane.showMessageDialog(null, "Insert Your Card!");       
              
        //Check PIN
        boolean bCheckPIN = true;
        do
        {
            String strUserPW = JOptionPane.showInputDialog("Put The PIN");
            if(!UserAccount.getPIN().equals(strUserPW))
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
        String strChoice = JOptionPane.showInputDialog("1.Deposit\n"
                + "2.Withdraw\n"
                + "3.Balace Enquiry\n"
                + "4.Cancel");
        
        switch(strChoice)
        {
            case "1":
                //Deposit Process
                UserAccount = DepositMoney(UserAccount);
                break;
            case "2":
                System.out.println("Choose 2");
                break;
            case "3":
                System.out.println("Choose 3");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Return your card!","Trasaction is cancled",JOptionPane.WARNING_MESSAGE);
                break;    
            default:
                break;
        }

    }

    public static Accounts DepositMoney(Accounts UserAccount)
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
                return UserAccount;
                
        }
        String strMoney = JOptionPane.showInputDialog("How many do want to deposit ?");
        return UserAccount;
    }
    
    /**
     * The Withdraw Transection 
     */
    
    public void WithdrawMoney(int q)
    {
        
    }
    
    /**
     * The Balance Inquiry
     */
    public void BalanceEnquiry(int q)
    {
        
    }
}
