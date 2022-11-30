package com.masai.Service;

import java.util.List;

import com.masai.Dto.ProductDto;
import com.masai.Exception.CartException;
import com.masai.Exception.LoginException;
import com.masai.Exception.ProductException;
import com.masai.Model.Cart;

public interface CartService {

	
	
	public Cart addProductToCart(Integer productId, Integer quantity, String key) throws CartException,LoginException,ProductException;
	
	
	public List<ProductDto> removeProductfromCart(Integer productId, String key) throws CartException,LoginException,ProductException;
	
	
	public List<ProductDto> updateProductQuantity(Integer productId, Integer quantity, String key)throws CartException,LoginException,ProductException;
	
	
	
	public Cart removeAllproduct(String key) throws CartException,LoginException;
	
	public List<ProductDto> viewAllProducts(String key) throws CartException,LoginException;
	
	
	
}
