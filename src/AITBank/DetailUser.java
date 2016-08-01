/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AITBank;

/**
 *
 * @author MrGO
 */
public class DetailUser 
{
    public int userNumber;
    public int accountNumber;
    public String fullName;
    public float balanceEnquiry;
    public String PIN;
    public float savingBalance;
    public float netSavingBalance;
    public float fixedBalance;
    public float chequeBalance;
    public int MaxWithdraw;
    
    DetailUser()
    {
        userNumber = 5612;
        accountNumber = 123456;
        fullName = "Warawat Suksakulwat";
        PIN = "1234";
        savingBalance = 500;
        netSavingBalance = 1000;
        fixedBalance = 1000;
        chequeBalance = 2000;
        balanceEnquiry = savingBalance + netSavingBalance + fixedBalance + chequeBalance;
        MaxWithdraw = 2000;
    }
}
