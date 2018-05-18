package com.java.oa.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.java.oa.domain.Person;
import com.java.oa.service.PersonService;

@Controller("personAction")
@Scope("prototype")
public class PersonAction extends BaseAction<Person>{
	@Resource(name="personService")
	private PersonService personService;
	 
	public String savePerson(){
		Person person = new Person();
		person.setName("asx二麻子");
		this.personService.savePerson(person);
		return LISTACTION;
	}
}
