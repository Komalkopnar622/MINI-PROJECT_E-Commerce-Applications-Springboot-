package com.masai.Service;

import com.masai.Exception.LoginException;
import com.masai.Model.Login;

public interface LoginService {
	
	
	public String logIntoAccount(Login dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;
	

}
