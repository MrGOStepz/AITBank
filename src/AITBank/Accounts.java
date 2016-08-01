/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;

public class Accounts 
{
    private int userNumber;
    private int accountNumber;
    private String fullName;
    protected float balanceEnquiry;
    protected float balance;
    protected float interest;
    private String PIN;
    
    Accounts()
    {
        fullName = "Test";
        balanceEnquiry = 2000;
        PIN = "1234";        
    }
    
    Accounts(float _balanceEnquiry)
    {
        balanceEnquiry = _balanceEnquiry;
    }
    
    public String getFullName()
    {
        return fullName;
    }
    
    public float getBalancEquiry()
    {
        return balanceEnquiry;
    }
    
    public String getPIN()
    {
        return PIN;
    }
}

