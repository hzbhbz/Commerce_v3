package com.digital.v3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.InventoryMapper;
import com.digital.v3.sql.vo.InventoryVO;

@Repository
public class InventoryDAO {

	@Autowired
	InventoryMapper inventoryMapper;

	public InventoryVO getInventoryById(long productId) throws DataAccessException {
		InventoryVO inventory = inventoryMapper.getInventoryById(productId);
		return inventory;
	}

	public void createInventory(InventoryVO inventoryVo) throws DataAccessException {
		inventoryMapper.createInventory(inventoryVo);
	}

	public InventoryVO getInventoryByName(String productName) throws DataAccessException {
		InventoryVO inventory = inventoryMapper.getInventoryByName(productName);
		return inventory;
	}

	public void updateInventoryQuantity(InventoryVO inventoryVo) throws DataAccessException {
		inventoryMapper.updateInventoryQuantity(inventoryVo);
	}
}
