package com.contact.service;

import com.contacts.dao.ContactsDAOImp;
import com.contacts.modal.Contact;

public class ServiceImp implements Service{
ContactsDAOImp contactsDAOImp=new ContactsDAOImp();
	
public boolean update(Contact contact) {
		// TODO Auto-generated method stub
		
		return contactsDAOImp.updateContactDAO(contact);
	}

	public boolean delete(Contact contact) {
		// TODO Auto-generated method stub
		return contactsDAOImp.deleteContactDAO(contact);
	}

	public boolean insert(Contact contact) {
		// TODO Auto-generated method stub
		return contactsDAOImp.insertContactDAO(contact);
	}

	public void display() {
		// TODO Auto-generated method stub
		contactsDAOImp.displayContactDAO();
	}

}
