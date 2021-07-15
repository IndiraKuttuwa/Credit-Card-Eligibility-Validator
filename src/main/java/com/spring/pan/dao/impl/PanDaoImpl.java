package com.spring.pan.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.pan.dao.PanDao;
import com.spring.pan.entity.Pan;
import com.spring.pan.util.HibernateUtil;

@Component
public class PanDaoImpl implements PanDao {

	
	static int flag =0;
//	@Autowired
//	private HibernateTemplate hibernateTemplate;

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

//	@Override
//	@Transactional
//	public int create(Pan pan) {
//		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
//		simpleJdbcInsert.withTableName("PANS").usingGeneratedKeyColumns("pan");
//		Map<String, Object> parameters = new HashMap<String, Object>(4);
//		parameters.put("pan", pan.getPan());
//		parameters.put("score", pan.getScore());
//
//		Number insertedId = simpleJdbcInsert.executeAndReturnKey(parameters);
//		return insertedId.intValue();
//
//	}
//
//	@Override
//	@Transactional
//	public Pan find(String pan) {
//		String pan2 = pan.toUpperCase();
//		Pan pan1 = (Pan) jdbcTemplate.queryForObject("select * from PANS where pan = ?", new Object[] { pan2 },
//				new PanRowMapper());
//		if (pan1 == null)
//			return null;
//		return pan1;
//	}

//	public HibernateTemplate getHibernateTemplate() {
//		return hibernateTemplate;
//	}
//
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
////
	
	
	
	

	public Pan find(String pan) {
		
		  final Session session = HibernateUtil.getHibernateSession();
		if(flag==0)
		{
		
		
		 
		Transaction transaction = session.beginTransaction();
		if(session.get(Pan.class,"AXSSP1122H")==null)
		session.save(new Pan("AXSSP1122H", 3.10f));
		if(session.get(Pan.class,"APPSA3355P")==null)
		session.save(new Pan("APPSA3355P", 8.50f));
		if(session.get(Pan.class,"APPXA2244X")==null)
		session.save(new Pan("APPXA2244X", 9.50f));
		if(session.get(Pan.class,"AXVPS7766V")==null)
		session.save(new Pan("AXVPS7766V", 1.50f));
		if(session.get(Pan.class,"ASXPS2121S")==null)
		session.save(new Pan("ASXPS2121S", 5.10f));
		transaction.commit();
		flag=1;
		}
		
		
		Pan pan1=new Pan();
	//	Pan pan1=hibernateTemplate.get(Pan.class, pan);
	
		
		 pan1 = session.get(Pan.class, pan);
		 session.close();
			HibernateUtil.shutdown();
		
		return pan1;
		
		
	}
	
	

}
