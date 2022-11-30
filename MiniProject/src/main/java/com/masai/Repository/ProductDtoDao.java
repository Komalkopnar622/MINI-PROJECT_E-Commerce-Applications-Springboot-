package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Dto.ProductDto;

public interface ProductDtoDao extends JpaRepository<ProductDto, Integer> {

	
	
}
