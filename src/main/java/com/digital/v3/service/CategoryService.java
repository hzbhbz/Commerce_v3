package com.digital.v3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digital.v3.dao.CategoryDAO;
import com.digital.v3.schema.Category;
import com.digital.v3.sql.vo.CategoryVO;

@Component
public class CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	/* 카테고리 등록 */
	public boolean categoryWrite (Category category) throws Exception {
		try {
			// category 중복 여부 확인
			if (categoryDAO.getCategoryByName(category.getCategoryName()) != null) {
				throw new Exception("이미 등록된 카테고리입니다."); 
			}
			
			// 중복이 아니면 write
			category.setCategoryId(System.currentTimeMillis());
			CategoryVO categoryVo = setCategoryVO(category);

			categoryDAO.createCategory(categoryVo);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
	/* 카테고리 검색 - categoryName */
	public Category categorySearch (String categoryName) throws Exception {
		
		CategoryVO categoryVo = categoryDAO.getCategoryByName(categoryName);
		
		Category category = new Category();
		if (categoryVo != null) {
			category = setCategory(categoryVo);
		}
		
		return category;
	}
	
	public Category setCategory (CategoryVO categoryVo) {
		Category category = new Category();
		
		category.setCategoryId(categoryVo.getCategoryId());
		category.setCategoryName(categoryVo.getCategoryName());
		
		return category;
	}
	
	public CategoryVO setCategoryVO (Category category) {
		CategoryVO categoryVo = new CategoryVO();
		
		categoryVo.setCategoryId(category.getCategoryId());
		categoryVo.setCategoryName(category.getCategoryName());
		
		return categoryVo;
	}

}
