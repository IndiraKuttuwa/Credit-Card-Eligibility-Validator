package com.spring.pan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.pan.dao.PanDao;
import com.spring.pan.entity.Pan;
import com.spring.pan.service.PanService;

@Component
public class PanServiceImpl implements PanService {

	@Autowired
	private PanDao dao;

	public PanDao getDao() {
		return dao;
	}

	public void setDao(PanDao dao) {
		this.dao = dao;
	}

	
	
	

	
	public Pan fetch(String pan) {
		// TODO Auto-generated method stub
		Pan pan1 = dao.find(pan);
		return pan1;
	}

}
