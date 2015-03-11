/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.banking.data;

import dk.cphbusiness.banking.model.Customer;
import java.util.Collection;

/**
 *
 * @author jonassimonsen
 */
public interface BankDataAccessor {
//    static BankDataAccessor instance = new BankDataAccessorStub();
   Customer saveCustomer(Customer customer);
   Customer findCustomer(int id);
   Collection<Customer> listCustomers();
}
