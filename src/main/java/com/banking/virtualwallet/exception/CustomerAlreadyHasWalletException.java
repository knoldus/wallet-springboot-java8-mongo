package com.banking.virtualwallet.exception;

import com.banking.virtualwallet.models.Customer;

public class CustomerAlreadyHasWalletException extends Exception {
    public CustomerAlreadyHasWalletException(Customer customer) {
        super("Customer "+customer.getFname()+" "+customer.getLname()+" already owns a wallet : "+customer.getUserId());
    }
}
