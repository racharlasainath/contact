package com.contact.service;

import com.contacts.modal.Contact;

public interface Service {

	public boolean update(Contact contact);
	public boolean delete(Contact contact);
	public boolean insert(Contact contact);
	public void display();
	
}
