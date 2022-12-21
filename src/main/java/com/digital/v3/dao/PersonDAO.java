package com.digital.v3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.digital.v3.sql.mapper.PersonMapper;
import com.digital.v3.sql.vo.PartyAddressVO;
import com.digital.v3.sql.vo.PartyPhoneVO;
import com.digital.v3.sql.vo.PersonVO;

@Repository
public class PersonDAO {
	
	@Autowired
	PersonMapper personMapper;

	public PersonVO getPersonByName(String personName) throws DataAccessException {
		PersonVO person = personMapper.getPersonByName(personName);
		return person;
	}

	public void createPerson(PersonVO personVo) throws DataAccessException {
		personMapper.createPerson(personVo);
		
	}

	public PersonVO getPersonById(long personId) throws DataAccessException {
		PersonVO person = personMapper.getPersonById(personId);
		return person;
	}

	public int isExistPartyAddress(PartyAddressVO partyAddressVo) throws DataAccessException {
		int partyAddress = personMapper.isExistPartyAddress(partyAddressVo);
		return partyAddress;
	}

	public void createPartyAddress(PartyAddressVO partyAddressVo) throws DataAccessException {
		personMapper.createPartyAddress(partyAddressVo);
	}

	public void deletePartyAddress(PartyAddressVO partyAddressVo) throws DataAccessException {
		personMapper.deletePartyAddress(partyAddressVo);
	}

	public int isExistPartyPhone(PartyPhoneVO partyPhoneVo) throws DataAccessException {
		int partyPhone = personMapper.isExistPartyPhone(partyPhoneVo);
		return partyPhone;
	}

	public void createPartyPhone(PartyPhoneVO partyPhoneVo) throws DataAccessException {
		personMapper.createPartyPhone(partyPhoneVo);
	}

	public void deletePartyPhone(PartyPhoneVO partyPhoneVo) throws DataAccessException {
		personMapper.deletePartyPhone(partyPhoneVo);
	}
	
	

}
