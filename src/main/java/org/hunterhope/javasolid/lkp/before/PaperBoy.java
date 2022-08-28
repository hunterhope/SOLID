/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.javasolid.lkp.before;
//送報生,負責收款

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
            //先拿到客戶的皮包
            Wallet wallet = customer.getWallet();
            //再從皮包拿錢
            int total = wallet.getMoney();
            //扣掉100元
            total = total-100;
            //再將剩餘的錢放回皮包
            wallet.setMoney(total);
            //得到了不應該得到的客戶 id
            wallet.getId();
            //做其他事...續約阿...
        }
    }
}
