/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;

public class Accounts 
{
    private String FullName;
    private float BalanceEnquiry;
    private String PIN;
    
    public Accounts()
    {
        FullName = "Test";
        BalanceEnquiry = 2000;
        PIN = "1234";        
    }
    
    public String getFullName()
    {
        return FullName;
    }
    
    public float getBalancEquiry()
    {
        return BalanceEnquiry;
    }
    
    public String getPIN()
    {
        return PIN;
    }
}

