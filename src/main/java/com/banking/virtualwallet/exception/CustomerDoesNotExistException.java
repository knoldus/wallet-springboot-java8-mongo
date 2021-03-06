package com.banking.virtualwallet.exception;

import com.banking.virtualwallet.models.Customer;

public class CustomerDoesNotExistException extends Exception {

    public CustomerDoesNotExistException(Customer customer)  {
        super("Customer with customer ID:" + customer.getUserId()+ " does not exist");
    }

    public CustomerDoesNotExistException(String email) {
        super("Customer with customer ID:" + email + " does not exist");
    }
}
