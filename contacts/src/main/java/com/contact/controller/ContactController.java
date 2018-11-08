package com.contact.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contact.service.ServiceImp;
import com.contacts.modal.Contact;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class ContactController
 */
@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	Contact contact = new Contact();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper=new ObjectMapper();
		
		String jsonInString = objectMapper.writeValueAsString(contact);
		System.out.println(jsonInString);
		response.getOutputStream().print(jsonInString);
		jsonInString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(contact);
		System.out.println(jsonInString);
		
		
		String action = request.getParameter("action");
		//String action="insert";

		if(action.equals("insert")) {
			processInsert(request, response);

		}
		if(action.equals("update")) {
			processUpdate(request, response);

		}
		if(action.equals("display")) {
			processDisplay(request, response);
		}
		if(action.equals("delete")) {
			processDelete(request, response);
		}
	}

	public void processInsert(HttpServletRequest request, HttpServletResponse response) {
		
		
		contact.setFirstName(request.getParameter("firstName"));
		contact.setLastName(request.getParameter("lastname"));
		contact.setDOB(request.getParameter("dob"));	

		contact.setAddress(request.getParameter("address"));
		contact.setEmail(request.getParameter("email"));
		
		//contact.setNumber(Integer.parseInt((request.getParameter("number"))));
		new ServiceImp().insert(contact);

	}

	public void processUpdate(HttpServletRequest request, HttpServletResponse response) {
		Contact contact = new Contact();
		contact.setId(Integer.parseInt((request.getParameter("id"))));
		new ServiceImp().update(contact);
	}

	public void processDelete(HttpServletRequest request, HttpServletResponse response) {
		Contact contact = new Contact();
		contact.setId(Integer.parseInt((request.getParameter("id"))));
		new ServiceImp().delete(contact);
	}

	public void processDisplay(HttpServletRequest request, HttpServletResponse response) {
		Contact contact = new Contact();
		contact.setId(Integer.parseInt((request.getParameter("id"))));
		new ServiceImp().display();
	}

}
