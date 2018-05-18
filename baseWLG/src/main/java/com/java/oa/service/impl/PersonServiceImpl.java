package com.java.oa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.oa.dao.PersonDao;
import com.java.oa.domain.Person;
import com.java.oa.service.PersonService;

@Service("personService") 
public class PersonServiceImpl implements PersonService{
	
	@Resource(name="personDao")
	private PersonDao personDao;
	
	@Transactional
	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}

}
