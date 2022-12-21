package com.digital.v3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.OrderMapper;
import com.digital.v3.sql.vo.OrderSheetVO;
import com.digital.v3.sql.vo.PartyProductVO;

@Repository
public class OrderDAO {
	
	@Autowired
	OrderMapper orderMapper;

	public OrderSheetVO getOrderSheetByPerson(long personId) throws DataAccessException {
		OrderSheetVO order = orderMapper.getOrderSheetByPerson(personId);
		return order;
	}

	public void createOrderSheet(OrderSheetVO orderSheetVO) throws DataAccessException {
		orderMapper.createOrderSheet(orderSheetVO);	
	}

	public void updateOrderIdOfOrderProduct(PartyProductVO orderProductVo) throws DataAccessException {
		orderMapper.updateOrderIdOfOrderProduct(orderProductVo);
	}

	public void deleteOrderSheet(long personId) throws DataAccessException {
		orderMapper.deleteOrderSheet(personId);
	}

	public OrderSheetVO getOrderSheetById(long orderSheetId) throws DataAccessException {
		OrderSheetVO order = orderMapper.getOrderSheetById(orderSheetId);
		return order;
	}

	public void createPurchase(long orderSheetId) throws DataAccessException {
		orderMapper.createPurchase(orderSheetId);
	}

	public OrderSheetVO getOrderById(long orderSheetId) throws DataAccessException {
		OrderSheetVO order = orderMapper.getOrderById(orderSheetId);
		return order;
	}

	public List<OrderSheetVO> getOrderByDate(long personId, String purchaseDate) throws DataAccessException {
		List<OrderSheetVO> date = orderMapper.getOrderByDate(personId, purchaseDate);
		return date;
	}

}
