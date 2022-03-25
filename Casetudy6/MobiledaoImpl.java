package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.spring.entity.Mobile;

@Repository
public class MobiledaoImpl implements Mobiledao {

	@PersistenceContext
	EntityManager entity;

	@Override
	public Mobile addMobile(Mobile mobile) {
		entity.persist(mobile);
		return entity.find(Mobile.class, mobile.getMobId());
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {

		return entity.merge(mobile);
	}

	@Override
	public String deleteMobile(int mobId) {
		Mobile mob = entity.find(Mobile.class, mobId);

		if (mob != null) {
			entity.remove(mob);
			return "mobile deleted";
		} else {
			return "no mobile found";
		}
	}

	@Override
	public Mobile getMobile(int mobId) {

		return entity.find(Mobile.class, mobId);
	}

	@Override
	public List<Mobile> getAllMobiles() {
		TypedQuery<Mobile> result = entity.createQuery("select m from Mobile m", Mobile.class);
		return result.getResultList();
	}

}
