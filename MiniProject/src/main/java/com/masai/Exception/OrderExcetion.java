package com.masai.Exception;

public class OrderExcetion  extends RuntimeException{
	
	public OrderExcetion()
	{
		
	}
	
	public OrderExcetion(String mess)
	{
		super(mess);
	}

}
