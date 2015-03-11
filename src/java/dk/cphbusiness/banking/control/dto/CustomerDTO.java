/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.banking.control.dto;

import java.io.Serializable;

/**
 *
 * @author jonassimonsen
 */
public class CustomerDTO implements Serializable {
    private final int id;
    private final String name;
    private final int total;

    public CustomerDTO(int id, String name, int total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }
    
}
