package com.digital.v3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.AddressMapper;
import com.digital.v3.sql.vo.AddressVO;


@Repository
public class AddressDAO {

	@Autowired
	AddressMapper addressMapper;

	public void createAddress(AddressVO addressVo) throws DataAccessException {
		addressMapper.createAddress(addressVo);
	}

	public AddressVO getAddressByDetail(String addressDetail) throws DataAccessException {
		AddressVO address = addressMapper.getAddressByDetail(addressDetail);
		return address;
	}
	
	

}
