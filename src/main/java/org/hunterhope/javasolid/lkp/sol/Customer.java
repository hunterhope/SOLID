/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.javasolid.lkp.sol;

import org.hunterhope.javasolid.lkp.before.*;
import org.hunterhope.javasolid.lkp.Wallet;

/**
 *
 * @author user
 */
public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    //請求付款
    public void pay(int payment) {
        int total = wallet.getMoney();
        total = total-payment;
        wallet.setMoney(total);
    }

    @Override
    public String toString() {
        return "Customer{" + "wallet=" + wallet + '}';
    }
    
    
}
