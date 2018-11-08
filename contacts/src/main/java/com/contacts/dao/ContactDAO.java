package com.contacts.dao;

import com.contacts.modal.Contact;

public interface ContactDAO {
	
	public boolean updateContactDAO(Contact contact);
	public boolean deleteContactDAO(Contact contact);
	public boolean insertContactDAO(Contact contact);
	public void displayContactDAO();
	
}

