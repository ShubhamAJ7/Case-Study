package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.Mobiledao;
import com.spring.entity.Mobile;

@Service
@Transactional
public class MobileServiceImpl  implements MobileService{
	
	@Autowired
	Mobiledao dao;

	@Override
	public Mobile addMobile(Mobile mobile) {
		
		return dao.addMobile(mobile);
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		
		return dao.updateMobile(mobile);
	}

	@Override
	public String deleteMobile(int mobId) {
		
		return dao.deleteMobile(mobId);
	}

	@Override
	public Mobile getMobile(int mobId) {
	
		return dao.getMobile(mobId);
	}

	@Override
	public List<Mobile> getAllMobiles() {
		
		return dao.getAllMobiles();
	}

}
