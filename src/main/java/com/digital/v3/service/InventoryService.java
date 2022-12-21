package com.digital.v3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digital.v3.dao.InventoryDAO;
import com.digital.v3.schema.Inventory;
import com.digital.v3.sql.vo.InventoryVO;

@Component
public class InventoryService {

	@Autowired
	InventoryDAO inventoryDAO;

	/* 재고 등록 */
	public boolean inventoryWrite (Inventory inventory) throws Exception {
		try {
			// inventory 중복 여부 확인
			if (inventoryDAO.getInventoryById(inventory.getProductId()) != null) {
				// 중복이면 update
				inventoryUpdate(inventory);
				return true;
			}
			
			// 중복이 아니면 write
			InventoryVO inventoryVo = setInventoryVO(inventory);

			inventoryDAO.createInventory(inventoryVo);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
	/* 재고 검색 - productName */
	public Inventory inventorySearch (String productName) throws Exception {
		
		InventoryVO inventoryVo = inventoryDAO.getInventoryByName(productName);
		
		Inventory inventory = new Inventory();
		if (inventoryVo != null) {
			inventory = setInventory(inventoryVo);
		}
		
		return inventory;
	}
	
	/* 재고 검색 - productId */
	public Inventory inventorySearchById (long productId) throws Exception {
		
		InventoryVO inventoryVo = inventoryDAO.getInventoryById(productId);
		
		Inventory inventory = new Inventory();
		if (inventoryVo != null) {
			inventory = setInventory(inventoryVo);
		}
		
		return inventory;
	}
	
	/* 재고 변경 */
	public boolean inventoryUpdate (Inventory inventory) throws Exception {
		try {
			InventoryVO inventoryVo = setInventoryVO(inventory);
			
			inventoryDAO.updateInventoryQuantity(inventoryVo);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
	/* 상품에 대한 입력 수량 유효성 확인 */
	public boolean inventoryQuantityCheck (long productId, long quantity) throws Exception {
		
		try {
			Inventory inventory = inventorySearchById(productId);
			if (inventory.getProductId() == 0) {
				throw new Exception("아직 재고를 등록하지 않은 상품입니다.");
			}
			if (inventory.getQuantity() - quantity < 0) {
				return false;
			}	
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Inventory setInventory (InventoryVO inventoryVo) {
		Inventory inventory = new Inventory();
		
		inventory.setProductId(inventoryVo.getProductId());
		inventory.setQuantity(inventoryVo.getQuantity());
		
		return inventory;
	}
	
	public InventoryVO setInventoryVO (Inventory inventory) {
		InventoryVO inventoryVo = new InventoryVO();
		
		inventoryVo.setProductId(inventory.getProductId());
		inventoryVo.setQuantity(inventory.getQuantity());
		
		return inventoryVo;
	}
	
}
