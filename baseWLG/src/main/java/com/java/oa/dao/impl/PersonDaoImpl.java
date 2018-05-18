package com.java.oa.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.java.oa.dao.PersonDao;
import com.java.oa.domain.Person;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao{
	
	@Resource(name="hibernateTemplate")
	public HibernateTemplate hibernateTemplate;
	
	@Override
	public void savePerson(Person person) {
		this.hibernateTemplate.save(person); 
	}

}
