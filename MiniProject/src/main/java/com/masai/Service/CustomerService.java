package com.masai.Service;

import java.util.List;

import com.masai.Exception.CustomerException;
import com.masai.Exception.LoginException;
import com.masai.Model.Customer;

public interface CustomerService {

	
	
	
	public Customer addCustomer(Customer customer) throws CustomerException;

	public Customer updateCust(Customer customer, String key) throws CustomerException, LoginException;
	
	public Customer removeCustomer(Customer customer,String key) throws CustomerException, LoginException;
	
	public Customer viemCustomer(Integer cusInteger) throws CustomerException;
	
//	public List<Customer> viewAll(String location) throws CustomerException;
	
	
}
