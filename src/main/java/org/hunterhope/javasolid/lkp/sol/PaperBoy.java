/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.javasolid.lkp.sol;
//送報生,負責收款

import org.hunterhope.javasolid.lkp.before.*;
import java.util.List;
import org.hunterhope.javasolid.lkp.Wallet;

public class PaperBoy {
    //他有許多的客戶
    private List<Customer> customers;

    public PaperBoy(List<Customer> customers) {
        this.customers = customers;
    }
    //收集所有報紙費用 $100
    public void collectMoney(){
        //輪尋所有客戶
        for(Customer customer:customers){
            //請客戶付款
            customer.pay(100);
        }
    }
}
