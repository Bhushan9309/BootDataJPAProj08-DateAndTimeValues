package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;
@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
     @Autowired
     private ICustomerRepository custRepo; 
	@Override
	public String registerCustomer(Customer cust) {
		int idVal=custRepo.save(cust).getCno();
		return "Customer is registered with id value : : ==> "+idVal;
	}
	@Override
	public Customer showCustomerByNo(int no) {
		return custRepo.findById(no).orElseThrow(()-> new IllegalArgumentException("Invalid ID"));
	}

}
