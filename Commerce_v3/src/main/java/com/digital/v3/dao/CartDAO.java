package com.digital.v3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.CartMapper;
import com.digital.v3.sql.vo.PartyProductVO;

@Repository
public class CartDAO {

	@Autowired
	CartMapper cartMapper;

	public int getQuantityOfPluralCartProduct(PartyProductVO cartProductVo) throws DataAccessException {
		int sum = cartMapper.getQuantityOfPluralCartProduct(cartProductVo);
		return sum;
	}

	public void createCartProduct(PartyProductVO cartProductVo) throws DataAccessException {
		cartMapper.createCartProduct(cartProductVo);

	}

	public List<PartyProductVO> getCartProductByPerson(long personId) throws DataAccessException {
		List<PartyProductVO> list = cartMapper.getCartProductByPerson(personId);
		return list;
	}

	public int isExistCartProduct(PartyProductVO partyProductVo) throws DataAccessException {
		int partyCart = cartMapper.isExistCartProduct(partyProductVo);
		return partyCart;
	}

	public void deleteCartProduct(PartyProductVO partyProductVo) throws DataAccessException {
		cartMapper.deleteCartProduct(partyProductVo);
	}
}
