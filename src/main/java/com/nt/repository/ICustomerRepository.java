package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
	//@Query(value="select round(timestampdiff(DAY,dob,curdate())/365.25,2) from jpa_customer_date_time where cno=:cno",nativeQuery = true)//for mysql
	@Query(value="select  (sysdate-dob)/365.25 from jpa_customer_date_time where cno=:cno",nativeQuery = true) //oracle
	public double getCustomerAgeByNo(int cno);
	
	//@Query(value="select cname,round(timestampdiff(DAY,dob,curdate())/365.25,2) from jpa_customer_date_time ",nativeQuery = true) //for mysql
	@Query(value="select cname,(sysdate-dob)/365.25 from jpa_customer_date_time ",nativeQuery = true)  //oracle
	public List<Object[]> showCustomersNameAndAge();

}
