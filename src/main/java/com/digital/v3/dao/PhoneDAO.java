package com.digital.v3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.PhoneMapper;
import com.digital.v3.sql.vo.PhoneVO;

@Repository
public class PhoneDAO {

	@Autowired
	PhoneMapper phoneMapper;

	public PhoneVO getPhoneByNumber(String phoneNumber) throws DataAccessException {
		PhoneVO phone = phoneMapper.getPhoneByNumber(phoneNumber);
		return phone;
	}

	public void createPhone(PhoneVO phoneVo) throws DataAccessException {
		phoneMapper.createPhone(phoneVo);
	}                       
}
