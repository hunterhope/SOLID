/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.javasolid.lkp;

import java.util.Arrays;
import java.util.List;
import org.hunterhope.javasolid.lkp.before.Customer;
import org.hunterhope.javasolid.lkp.before.PaperBoy;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(new Wallet(1000, "A1234")),
                new Customer(new Wallet(500, "B1234")),
                new Customer(new Wallet(200, "C1234"))
        );
        System.out.println(customers);
        
        //送報生收款
        PaperBoy paperBoy = new PaperBoy(customers);
        paperBoy.collectMoney();
        
        System.out.println(customers);
    }
}
