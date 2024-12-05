package com.demo.service;

import java.util.List;

import com.demo.beans.Book;
import com.demo.dao.DaoOperations;
import com.demo.dao.DaoOperationsImpl;

public class BookServicesImpl implements BookService{
	DaoOperations dao = new DaoOperationsImpl();
	public List<Book> getBooks(String b) {
		
		return dao.getBooks(b);
	}

}
