package com.nt.service;

import com.nt.entity.Customer;

public interface ICustomerMgmtService {
    public String registerCustomer(Customer cust);
    public Customer showCustomerByNo(int no);
}
