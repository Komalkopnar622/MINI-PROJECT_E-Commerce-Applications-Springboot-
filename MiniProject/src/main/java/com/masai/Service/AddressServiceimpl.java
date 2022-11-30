package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.AddressException;
import com.masai.Exception.LoginException;
import com.masai.Model.Address;
import com.masai.Model.Customer;
import com.masai.Model.Session;
import com.masai.Repository.AddressDao;
import com.masai.Repository.CustomerDao;
import com.masai.Repository.SessionDao;
@Service
public class AddressServiceimpl  implements AddressService{

	
	@Autowired
	private AddressDao ads;
	
	
	@Autowired
	private  CustomerDao cust;
	
	@Autowired
	private  SessionDao ses;
	
	
	@Override
	public Address addAddress(Address add, String key) throws AddressException, LoginException {
		// TODO Auto-generated method stub
		Session loggedInUser= ses.findByuuid(key);
		
		if(loggedInUser == null)
		{
			throw new LoginException("Please Provide Valid Username or pass");
		}
		else
		{
		      
			Optional<Customer> s = cust.findById(loggedInUser.getUserId());
			
			
			  Customer  ss = s.get();
			  
			  Address ad = ads.save(add);
			  
			   ss.setAddress(ad);
			   
			   
			   cust.save(ss);
			   
			   return ad;
			  
			 
			     
			
		}
		
	}

	@Override
	public Address updateAddress(Address add, String key) throws AddressException, LoginException {
		// TODO Auto-generated method stub
		
        Session loggedInUser= ses.findByuuid(key);
		
		if(loggedInUser == null)
		{
			throw new LoginException("Oops Pleas login and Update the Address");
		}
		else
		{
		    
			Optional<Customer> s = cust.findById(loggedInUser.getUserId());
			
			
			  Customer  ss = s.get();
			  
			  Address ad = ads.save(add);
			  
			   ss.setAddress(ad);
			   
			   
			   cust.save(ss);
			   
			   return ad;
			  
			
			   
		}
	
	}

	@Override
	public String removeAddress(Integer addressId, String key) throws AddressException, LoginException {
		// TODO Auto-generated method stub
		
        Session loggedInUser= ses.findByuuid(key);
		
		if(loggedInUser == null)
		{
			throw new LoginException("Please Provide Valid Username or pass");
		}
		
		else
		{
		       ads.deleteById(addressId);
		       
		       return "Address Deleted";
		}
		
	}

	@Override
	public List<Address> viewAlladdress() throws AddressException {
		// TODO Auto-generated method stub
		
		
		     List<Address> ad = ads.findAll();
		
		     
		     return ad;
		
		
		
	}

	@Override
	public Address viewAddress(Integer id) throws AddressException {
		// TODO Auto-generated method stub
		
		 Optional<Address> opt = ads.findById(id);
		
		 
		 if(opt.isPresent())
		 {
			 return opt.get();
		 }
		 else
		 {
			 throw new AddressException("Address Does not exist");
		 }
	}

	
	
	
	
}
