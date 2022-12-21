package com.digital.v3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.ProductMapper;
import com.digital.v3.sql.vo.ProductVO;

@Repository
public class ProductDAO {
	
	@Autowired
	ProductMapper productMapper;

	public ProductVO getProductByName(String productName) throws DataAccessException {
		ProductVO product = productMapper.getProductByName(productName);
		return product;
	}

	public void createProduct(ProductVO productVo) throws DataAccessException {
		productMapper.createProduct(productVo);
		
	}

	public List<ProductVO> getProductByKeyword(String keyword) throws DataAccessException {
		List<ProductVO> product = productMapper.getProductByKeyword(keyword);
		return product;
	}

	public List<ProductVO> getProductByCategory(String categoryName) throws DataAccessException {
		List<ProductVO> category = productMapper.getProductByCategory(categoryName);
		return category;
	}

}
