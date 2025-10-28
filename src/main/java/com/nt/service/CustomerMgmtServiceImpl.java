package com.nt.service;

import java.util.List;

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
	@Override
	public List<Customer> showAllCustomers() {
		return custRepo.findAll();
	}
	@Override
	public double findCustomerAgeById(int id) {
		return custRepo.getCustomerAgeByNo(id);
	}
	@Override
	public List<Object[]> findCustomersNameAndAge() {
		return custRepo.showCustomersNameAndAge();
	}

}
