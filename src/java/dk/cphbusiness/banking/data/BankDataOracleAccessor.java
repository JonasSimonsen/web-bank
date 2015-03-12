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
public class BankDataOracleAccessor implements BankDataAccessor {

    private static final String DRIVER = "oracle.jbdc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";

    public BankDataOracleAccessor() throws ClassNotFoundException {
        try {
            Class.forName(DRIVER);
        } 
        catch (ClassNotFoundException cnfe) {
            throw cnfe;
        }
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customer findCustomer(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Customer> listCustomers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
