package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.Exception.AddressException;
import com.masai.Model.Address;

public interface AddressDao  extends JpaRepository<Address, Integer> {

	
	@Query("from Address where state = ?1")
	public Address viewAllAddress(String id) throws AddressException;
	
}
