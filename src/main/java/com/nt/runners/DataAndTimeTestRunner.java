package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;
@Component
public class DataAndTimeTestRunner implements CommandLineRunner {
    @Autowired
    private ICustomerMgmtService custService;
	
	@Override
	public void run(String... args) throws Exception {
		/* try {
			Customer cust = new Customer("Bhushan Patil", "Nandurbar",45603.0,LocalDate.of(1990,10,20),
					                                                                                                        LocalTime.of(20,30),
					                                                                                                        LocalDateTime.of(2014,10,20,6,55));
			//use service
			String msg=custService.registerCustomer(cust);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			Customer cust=custService.showCustomerByNo(100);
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		 
	}

}
