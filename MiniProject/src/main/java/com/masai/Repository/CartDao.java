package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.Exception.CustomerException;
import com.masai.Model.Cart;
import com.masai.Model.Customer;

public interface CartDao  extends JpaRepository<Cart, Integer>{

	
	
	public Cart findByCustomer(Customer customer) throws CustomerException;
	
	
	@Query("select c from Cart c where c.customer.customerId=?1")
	public Cart getCart(Integer custId);
	
	
	
}
