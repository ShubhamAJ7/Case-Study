package com.spring.dao;

import java.util.List;

import com.spring.entity.Mobile;

public interface Mobiledao {

	Mobile addMobile(Mobile mobile);

	Mobile updateMobile(Mobile mobile);

	String deleteMobile(int mobId);

	Mobile getMobile(int mobId);

	List<Mobile> getAllMobiles();
}
