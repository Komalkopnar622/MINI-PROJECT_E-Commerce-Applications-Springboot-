package com.masai.Service;

import java.util.List;

import com.masai.Exception.AddressException;
import com.masai.Exception.LoginException;
import com.masai.Model.Address;

public interface AddressService {

	
	
	public Address addAddress(Address add , String key) throws AddressException, LoginException;
	
	public Address updateAddress(Address add, String key) throws AddressException , LoginException;
	
	public String removeAddress(Integer addressId,String key) throws AddressException, LoginException;
	
	public List<Address> viewAlladdress();
	
	public Address viewAddress(Integer id) throws AddressException;
	
}
