/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;
//Interitance from Account
public class NetSavingAccounts extends Accounts
{
    private float InterestRate = 0;
    private float LimitWithdraw = 0;
    
    
    NetSavingAccounts(float _savingBalance)
    {
        balance = _savingBalance;
    }
    
    NetSavingAccounts(float _savingBalance,int _maxWithdraw)
    {
        balance = _savingBalance;
        maxWithdraw = _maxWithdraw;
    }
    
    public float getInterestRate()
    {
        return InterestRate;
    }
    
    public void setInterestRate(float fInterestRate)
    {
        InterestRate =  (fInterestRate < 0)? 0:fInterestRate;
    }
    
    public float getLimitWithdraw()
    {
        return LimitWithdraw;
    }
    
    public void setLimitWithdraw(float fLimitWithdraw)
    {
        LimitWithdraw = fLimitWithdraw;
    }
    

}
