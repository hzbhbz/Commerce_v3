package com.digital.v3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.CategoryMapper;
import com.digital.v3.sql.vo.CategoryVO;

@Repository
public class CategoryDAO {

	@Autowired
	CategoryMapper categoryMapper;

	public CategoryVO getCategoryByName(String categoryName) throws DataAccessException {
		CategoryVO category = categoryMapper.getCategoryByName(categoryName);
		return category;
	}

	public void createCategory(CategoryVO categoryVo) throws DataAccessException {
		categoryMapper.createCategory(categoryVo);
	}

}
