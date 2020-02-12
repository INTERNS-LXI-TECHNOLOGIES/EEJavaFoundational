package com.lxisoft.contacts.model;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lxisoft.contacts.domain.Contact;

@Repository("ContactDao")
public class ContactDaoImpl implements ContactDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	public void addContact(Contact contact)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(contact);
	}
	@SuppressWarnings("unchecked")
	public List<Contact> listContacts()
	{
		return (List<Contact>) sessionFactory.getCurrentSession().createCriteria(Contact.class).list();
	}
	public Contact getContact(int id)
	{
		return (Contact) sessionFactory.getCurrentSession().get(Contact.class,id);
	}
	public void deleteContact(Contact c)
	{
		sessionFactory.getCurrentSession().createQuery("DELETE FROM contacts where id="+c.getId()).executeUpdate();
	}
	
}