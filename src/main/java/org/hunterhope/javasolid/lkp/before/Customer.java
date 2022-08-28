/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.javasolid.lkp.before;

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

    //讓外界可以得到你的皮包
    public Wallet getWallet() {
        return wallet;
    }

    @Override
    public String toString() {
        return "Customer{" + "wallet=" + wallet + '}';
    }
    
    
}
