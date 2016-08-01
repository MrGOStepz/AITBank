/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;

import java.util.Date;

public class SavingAccounts extends Accounts
{
    private float savingBalanceWithInterest;
    private Date openDate;
    private Date intervelInterest;
    public float maxWithdraw;
       
    SavingAccounts()
    {
        interest = 0.5f;
        intervelInterest = Date.
    }
    
    SavingAccounts(float _savingBalance)
    {
        balance = _savingBalance;
    }
    
    SavingAccounts(float _savingBalance,int _maxWithdraw)
    {
        balance = _savingBalance;
        maxWithdraw = _maxWithdraw;
    }

    
    public void withdrawMoney(int _amount)
    {
        balance -= _amount;
    }
    
    public void depositMoney(float _amount)
    {
        balance += _amount;
    }
    
    public float getSavingBalance()
    {
        return balance;
    }
    
    private void calculateInterest()
    {      
        savingBalanceWithInterest = balance * (1 + interest/100);
    }
    
    public float getBalanceWithInter()
    {
        return savingBalanceWithInterest;
    }
    
    
}
