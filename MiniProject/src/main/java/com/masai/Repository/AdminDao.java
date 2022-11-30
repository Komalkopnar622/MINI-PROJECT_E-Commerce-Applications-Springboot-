package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.Admin;
import com.masai.Model.Customer;

public interface AdminDao  extends JpaRepository<Admin, Integer>{
	
	public Admin findByemail(String email);

}