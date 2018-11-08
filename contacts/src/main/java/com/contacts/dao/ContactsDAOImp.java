package com.contacts.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.contacts.Utill.DAOUtill;
import com.contacts.modal.Contact;


public class ContactsDAOImp implements ContactDAO {

	public boolean updateContactDAO(Contact contact) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Connection connection=new DAOUtill().getConnection();
			String query="update table contact set firstName=?,lastName=?,Number=?,Email=? where id=? ";
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(query);
			//preparedStatement.setInt(1, contact.getId());
			preparedStatement.setString(2, contact.getFirstName());
			preparedStatement.setString(3, contact.getLastName());
			//preparedStatement.setLong(4, contact.getNumber());
			preparedStatement.setString(5, contact.getEmail());
			preparedStatement.setString(7, contact.getDOB());
			preparedStatement.setString(8, contact.getAddress());
			
			i=preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i>0;
	}

	public boolean deleteContactDAO(Contact contact) {
		// TODO Auto-generated method stub
		try {
			Connection connection=new DAOUtill().getConnection();
			String query="select * from contact where id = ?";
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(query);
			int i=preparedStatement.executeUpdate();
			
			return i>0;
					
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	public boolean insertContactDAO(Contact contact) {
		// TODO Auto-generated method stub
		try {
			Connection connection=new DAOUtill().getConnection();
			String query="insert into contact(firstname,lastname,email,dataofbirth,address) values(?,?,?,?,?);";
			
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, contact.getFirstName());
			preparedStatement.setString(2, contact.getLastName());
			//preparedStatement.setLong(4, contact.getNumber());
			preparedStatement.setString(3, contact.getEmail());
			preparedStatement.setString(4, contact.getDOB());
			preparedStatement.setString(5, contact.getAddress());
			
			int i = preparedStatement.executeUpdate();
			
			return i>0;
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public void displayContactDAO() {
		// TODO Auto-generated method stub
		try {
			Connection connection=new DAOUtill().getConnection();
			PreparedStatement preparedStatement = null;
			ResultSet rSet=preparedStatement.executeQuery("Select * from contact");
			do {
				Contact contact=new Contact();
				contact.setId(rSet.getInt(1));
				contact.setFirstName(rSet.getString(2));
				contact.setLastName(rSet.getString(3));
				contact.setNumber(rSet.getLong(4));
				contact.setEmail(rSet.getString(5));
				contact.setDOB(rSet.getString(7));
				contact.setAddress(rSet.getString(8));
			}
			while(rSet.next()); {
				
					
						Contact contact=new Contact();
						contact.setId(rSet.getInt(1));
						contact.setFirstName(rSet.getString(2));
						contact.setLastName(rSet.getString(3));
						contact.setNumber(rSet.getLong(4));
						contact.setEmail(rSet.getString(5));
						contact.setDOB(rSet.getString(7));
						contact.setAddress(rSet.getString(8));
					}
				
				
			}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}